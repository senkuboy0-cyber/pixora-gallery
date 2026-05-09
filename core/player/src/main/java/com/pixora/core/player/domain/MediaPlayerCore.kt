package com.pixora.core.player.domain

interface MediaPlayerCore {
    fun play()
    fun pause()
    fun seekTo(positionMs: Long)
    fun setPlaybackSpeed(speed: Float)
    fun loadMedia(uri: String)
    fun release()
}
