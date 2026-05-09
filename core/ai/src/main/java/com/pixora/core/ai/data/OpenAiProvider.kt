package com.pixora.core.ai.data

import com.pixora.core.ai.domain.AiProvider

class OpenAiProvider : AiProvider {
    override val name: String = "OpenAI"
    override val isAvailable: Boolean = true

    override suspend fun generateText(prompt: String): Result<String> {
        return Result.success("OpenAI generated text for: $prompt")
    }

    override suspend fun analyzeImage(prompt: String, imageUri: String): Result<String> {
        return Result.success("OpenAI analyzed image at $imageUri with prompt: $prompt")
    }
}
