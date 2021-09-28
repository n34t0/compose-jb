package org.jetbrains.compose.videoplayer.demo

import androidx.compose.material.MaterialTheme
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import org.jetbrains.compose.videoplayer.VideoPlayer

fun main() {
    singleWindowApplication(
        title = "Video Player",
        state = WindowState(width = 800, height = 800)
    ) {
        MaterialTheme {
            VideoPlayer(
                url = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
                width = 640,
                height = 480
            )
        }
    }
}
