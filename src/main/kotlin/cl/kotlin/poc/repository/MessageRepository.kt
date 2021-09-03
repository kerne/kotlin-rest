package cl.kotlin.poc.repository

import cl.kotlin.poc.dto.Message
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String> {

    @Query("select * from MESSAGE")
    fun findMessages(): List<Message>

}