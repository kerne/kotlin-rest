package cl.kotlin.poc.services

import cl.kotlin.poc.dto.Message
import cl.kotlin.poc.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageServices(val db: MessageRepository) {

    fun findMessage(): List<Message> = db.findMessages()

    fun post(message: Message) {
        db.save(message)
    }

}