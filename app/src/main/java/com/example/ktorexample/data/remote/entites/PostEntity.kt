package com.example.ktorexample.data.remote.entites
import kotlinx.serialization.Serializable

import kotlinx.serialization.SerialName


@Serializable
data class PostEntityItem(
    @SerialName("body")
    val body: String?,
    @SerialName("id")
    val id: Int?,
    @SerialName("title")
    val title: String?,
    @SerialName("userId")
    val userId: Int?
)