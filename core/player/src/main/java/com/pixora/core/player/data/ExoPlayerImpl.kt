package com.pixora.core.player.data

import com.pixora.core.player.domain.MediaPlayerCore

class ExoPlayerImpl : MediaPlayerCore {
    override fun play() {
        // Implement ExoPlayer play logic
    }

    override fun pause() {
        // Implement ExoPlayer pause logic
    }

    override fun seekTo(positionMs: Long) {
        // Implement ExoPlayer seek logic
    }

    override fun setPlaybackSpeed(speed: Float) {
        // Implement ExoPlayer speed control
    }

    override fun loadMedia(uri: String) {
        // Implement ExoPlayer media loading
    }

    override fun release() {
        // Implement ExoPlayer release logic
    }
}
