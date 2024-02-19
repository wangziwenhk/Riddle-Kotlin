@file:Suppress("CascadeIf")

package main.kotlin

import gen.RiddleParser
import gen.RiddleParserBaseVisitor
import kotlin.math.pow

class Visitor : RiddleParserBaseVisitor<Any>() {

    override fun visitProgram(ctx: RiddleParser.ProgramContext?): Any {
        ObjectManager.inSpace()
        visitChildren(ctx)
        ObjectManager.outSpace()
        return 0
    }

    override fun visitStatment(ctx: RiddleParser.StatmentContext?): Any? {
        val result = super.visitStatment(ctx)
//        ObjectManager.printAllObject()
//        println()
        return result
    }

    //整数判断
    override fun visitIntLiteral(ctx: RiddleParser.IntLiteralContext?): Int {
        val str = ctx!!.children[0].toString().toCharArray()
        if (str.size >= 2) {
            //十六进制判定
            if (str[0] == '0' && str[1].lowercaseChar() == 'x') {
                val number = str.copyOfRange(2, str.size)
                return number.joinToString("").toInt(16)
            }
            //二进制判定
            else if (str[0] == '0' && str[1].lowercaseChar() == 'b') {
                val number = str.copyOfRange(0, str.size - 1)
                return number.joinToString("").toInt(2)
            }
            //八进制判定
            else if (str[0] == '0') {
                val number = str.copyOfRange(1, str.size)
                return number.joinToString("").toInt(8)
            }
        }
        return str.joinToString("").toInt()
    }

    override fun visitStrLiteral(ctx: RiddleParser.StrLiteralContext?): String {
        val chars = ctx!!.children[0].toString().toCharArray()
        //特殊字符串前缀处理
        if (chars[0] != '\"') {
            if (chars[0] == 'r') {
                val str = chars.copyOfRange(2, chars.size - 1)
                return str.joinToString("")
            }
        }


        val str = chars.copyOfRange(1, chars.size - 1)
        var ans = charArrayOf()
        var i = 0
        while (i < str.size) {
            if (str[i] == '\\') {
                val char = str[i + 1]
                if (char == '\\') ans += '\\'
                else if (char == '\"') ans += '\"'
                else if (char == '\'') ans += '\''
                else if (char == 'b') ans += '\b'
                else if (char == 't') ans += '\t'
                else if (char == 'r') ans += '\r'
                else if (char == 'n') ans += '\n'
                else if (char == 'v') ans += '\u000B'
                else if (char == 'f') ans += '\u000C'
                else if (char == '0') ans += '\u0000'
                else if (char == 'o') {
                    val oct: CharArray = charArrayOf(str[i + 2], str[i + 3], str[i + 4])
                    val unicode = oct.joinToString("").toInt(8).toChar()
                    ans += unicode
                    i += 3
                } else if (char == 'x') {
                    val oct: CharArray = charArrayOf(str[i + 2], str[i + 3])
                    val unicode = oct.joinToString("").toInt(16).toChar()
                    ans += unicode
                    i += 2
                } else if (char == 'u') {
                    val oct: CharArray = charArrayOf(str[i + 2], str[i + 3], str[i + 4], str[i + 5])
                    val unicode = oct.joinToString("").toInt(16).toChar()
                    ans += unicode
                    i += 4
                } else ans += charArrayOf('\\', char)
                i++
            } else ans += str[i]
            i++
        }
        return ans.joinToString("")
    }

    override fun visitCharLiteral(ctx: RiddleParser.CharLiteralContext?): String {
        val chars = ctx!!.children[0].toString().toCharArray()
        val str = chars.copyOfRange(1, chars.size - 1)
        var ans = charArrayOf()
        if (str[0] == '\\') {
            val char = str[1]
            if (char == '\\') ans += '\\'
            else if (char == '\"') ans += '\"'
            else if (char == '\'') ans += '\''
            else if (char == 'b') ans += '\b'
            else if (char == 't') ans += '\t'
            else if (char == 'r') ans += '\r'
            else if (char == 'n') ans += '\n'
            else if (char == 'v') ans += '\u000B'
            else if (char == 'f') ans += '\u000C'
            else if (char == '0') ans += '\u0000'
            else if (char == 'o') {
                val oct: CharArray = charArrayOf(str[2], str[3], str[4])
                val unicode = oct.joinToString("").toInt(8).toChar()
                ans += unicode
            } else if (char == 'x') {
                val oct: CharArray = charArrayOf(str[2], str[3])
                val unicode = oct.joinToString("").toInt(16).toChar()
                ans += unicode
            } else if (char == 'u') {
                val oct: CharArray = charArrayOf(str[2], str[3], str[4], str[5])
                val unicode = oct.joinToString("").toInt(16).toChar()
                ans += unicode
            } else ans += charArrayOf('\\', char)
        } else ans += str[8]
        return ans.joinToString("")
    }

    override fun visitFloatLiteral(ctx: RiddleParser.FloatLiteralContext?): Double {
        val str = ctx!!.children[0].toString().toCharArray()

        var index = str.indexOf('e')
        if (index == -1) index = str.indexOf('E')

        val ans: Double
        if (index != -1) {
            val base = str.copyOfRange(0, index).joinToString("").toDouble()
            val k = str.copyOfRange(index + 1, str.size).joinToString("").toDouble()
            ans = base*10.0.pow(k)
        } else {
            ans = str.joinToString("").toDouble()
        }
        return ans
    }

    override fun visitIdExpression(ctx: RiddleParser.IdExpressionContext?): Any {
        val str = ctx!!.children[0].toString()
        return ObjectManager.getObject(str).value
    }

    override fun visitVariableDefine(ctx: RiddleParser.VariableDefineContext?): Any {
        val newCtx = ArrayList<Any>()
        for (children in ctx!!.children) {
            if (children.childCount != 0) {
                newCtx.add(visit(children))
            } else newCtx.add(children)
        }
        val isConst: Boolean = newCtx[0].toString() == "val"

        var i = 1
        while (i < newCtx.size) {
            if (i<newCtx.size-1 && newCtx[i + 1].toString() == "=") {
                val name = newCtx[i].toString()
                val type = newCtx[i + 2]::class.simpleName.toString()
                val value = newCtx[i + 2]
                ObjectManager.defineObject(name, type, value, isConst)
                i += 3
            } else if (newCtx[i].toString() != ",") {
                val name = newCtx[i].toString()
                ObjectManager.defineObject(name, isConst=isConst)
                i++
            } else {
                i++
            }
        }
        return Any()
    }

    //赋值表达式
    override fun visitAssignExpression(ctx: RiddleParser.AssignExpressionContext?): Any {
        val name = ctx!!.children[0].toString()
        val value = visit(ctx.children[2])

        ObjectManager.setValue(name, value)
        return 0
    }

    override fun visitBlock(ctx: RiddleParser.BlockContext?): Any? {
        ObjectManager.inSpace()
        val result = visitChildren(ctx)
        ObjectManager.outSpace()
        return result
    }
}