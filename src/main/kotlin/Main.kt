package main.kotlin

import gen.RiddleLexer
import gen.RiddleParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File

fun main(){
    val content = File("C:\\Users\\wangz\\IdeaProjects\\Riddle-Kotlin\\example.rile").readText()
    val inputStream = CharStreams.fromString(content)
    val lexer = RiddleLexer(inputStream)
    val tokens = CommonTokenStream(lexer)
    val parser = RiddleParser(tokens)
    val tree = parser.program()

    val visitor = Visitor()
    visitor.visit(tree)
}