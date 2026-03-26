package blogai

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogaiApplication

fun main(args: Array<String>) {
	runApplication<BlogaiApplication>(*args)
}
