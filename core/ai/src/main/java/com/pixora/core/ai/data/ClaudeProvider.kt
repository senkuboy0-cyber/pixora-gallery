package com.pixora.core.ai.data

import com.pixora.core.ai.domain.AiProvider

class ClaudeProvider : AiProvider {
    override val name: String = "Claude"
    override val isAvailable: Boolean = true

    override suspend fun generateText(prompt: String): Result<String> {
        return Result.success("Claude generated text for: $prompt")
    }

    override suspend fun analyzeImage(prompt: String, imageUri: String): Result<String> {
        return Result.success("Claude analyzed image at $imageUri with prompt: $prompt")
    }
}
