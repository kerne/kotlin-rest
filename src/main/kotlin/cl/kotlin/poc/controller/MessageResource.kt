package cl.kotlin.poc.controller

import cl.kotlin.poc.dto.Message
import cl.kotlin.poc.services.MessageServices
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class MessageResource(val service: MessageServices) {

    @GetMapping
    fun index(): List<Message> = service.findMessage()

    @PostMapping
    fun post(@RequestBody message: Message) {
        service.post(message)
    }

}