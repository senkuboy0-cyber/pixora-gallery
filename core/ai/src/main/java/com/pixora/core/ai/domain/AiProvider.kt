package com.pixora.core.ai.domain

interface AiProvider {
    val name: String
    val isAvailable: Boolean

    suspend fun generateText(prompt: String): Result<String>
    suspend fun analyzeImage(prompt: String, imageUri: String): Result<String>
}
