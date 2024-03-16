package main.kotlin

import gen.RiddleLexer
import gen.RiddleParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

fun getParserTree(path: String = "C:\\Users\\wangz\\IdeaProjects\\Riddle-Kotlin\\example.red"): RiddleParser.ProgramContext {
    //获取解析树
    val inputFilePath: String = path
    val content = File(inputFilePath).readText()
    val inputStream = CharStreams.fromString(content)
    val lexer = RiddleLexer(inputStream)
    val tokens = CommonTokenStream(lexer)
    val parser = RiddleParser(tokens)
    val tree = parser.program()
    return tree
}
fun main() {
    val tree = getParserTree()
    TheVisitor.visit(tree)
}