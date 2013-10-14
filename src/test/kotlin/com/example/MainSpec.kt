package com.example

import org.spek.junit.api.JUnitSpek
import com.example.Main

public class MainSpec : JUnitSpek() {{
    given("Hello") {
        val sut = Main()

        on("greet to John") {
            val actual = sut.greet("John")
            it("should return 'Hello, John.'") {
                shouldEqual("Hello, John.", actual)
            }
        }
    }
}}