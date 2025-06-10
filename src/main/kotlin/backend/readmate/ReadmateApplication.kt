package backend.readmate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReadmateApplication

fun main(args: Array<String>) {
    runApplication<ReadmateApplication>(*args)
}
