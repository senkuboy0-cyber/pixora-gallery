package com.pixora.core.ai.data

import com.pixora.core.ai.domain.AiProvider

class GeminiProvider : AiProvider {
    override val name: String = "Gemini"
    override val isAvailable: Boolean = true

    override suspend fun generateText(prompt: String): Result<String> {
        return Result.success("Gemini generated text for: $prompt")
    }

    override suspend fun analyzeImage(prompt: String, imageUri: String): Result<String> {
        return Result.success("Gemini analyzed image at $imageUri with prompt: $prompt")
    }
}
