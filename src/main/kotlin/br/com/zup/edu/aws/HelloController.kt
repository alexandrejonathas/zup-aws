package br.com.zup.edu.aws

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue

@Controller
class HelloController {

    @Get("/say-hello")
    fun sayHello(@QueryValue("name") name: String?): String {
        val nome = if(name.isNullOrBlank())
            "default"
        else
            name

        return "Olá $nome"
    }

}