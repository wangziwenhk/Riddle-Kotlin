package main.kotlin

import gen.RiddleLexer
import gen.RiddleParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File
import java.util.*

var isDebug = true

fun main() {
    val screen = Scanner(System.`in`)

    val inputFilePath: String = if (isDebug) "C:\\Users\\wangz\\IdeaProjects\\Riddle-Kotlin\\example.red"
    else screen.nextLine()

    val content = File(inputFilePath).readText()
    val inputStream = CharStreams.fromString(content)
    val lexer = RiddleLexer(inputStream)
    val tokens = CommonTokenStream(lexer)
    val parser = RiddleParser(tokens)
    val tree = parser.program()

    val visitor = Visitor()
    visitor.visit(tree)
}