package main.kotlin

import gen.RiddleLexer
import gen.RiddleParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

var isDebug = false

fun main(){
    val content = File("C:\\Users\\wangz\\IdeaProjects\\Riddle-Kotlin\\example.red").readText()
    val inputStream = CharStreams.fromString(content)
    val lexer = RiddleLexer(inputStream)
    val tokens = CommonTokenStream(lexer)
    val parser = RiddleParser(tokens)
    val tree = parser.program()

    val visitor = Visitor()
    visitor.visit(tree)
}