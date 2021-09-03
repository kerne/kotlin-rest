package cl.kotlin.poc.dto

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("MESSAGE")
data class Message(@Id val id: String?, val text: String)