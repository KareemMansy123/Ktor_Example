package com.example.ktorexample.data.remote

import android.util.Log
import com.example.ktorexample.core.ApiRoutes
import com.example.ktorexample.data.remote.entites.PostEntityItem
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.request.*

suspend fun handler(url: String, client: HttpClient): List<PostEntityItem> {
    return try {
        client.get {
            url("${ApiRoutes.BASE_URL}$url")
//            parameter()
//            headers {}
        }
    } catch (e: RedirectResponseException) {
        Log.e("KtorExceptionRedirect", "getPosts: ${e.response.status.description}")
        emptyList()
    } catch (e: ClientRequestException) {
        Log.e("KtorExceptionClient", "getPosts: ${e.response.status.description}")
        emptyList()
    } catch (e: ServerResponseException) {
        Log.e("KtorExceptionServer", "getPosts: ${e.response.status.description}")
        emptyList()
    } catch (e: Exception) {
        Log.e("KtorException", "getPosts: ${e.message}")
        emptyList()
    }
}
