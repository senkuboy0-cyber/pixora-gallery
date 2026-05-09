package com.pixora.core.ui.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import com.pixora.core.ui.theme.CinematicCyan
import com.pixora.core.ui.theme.LiquidBlue
import com.pixora.core.ui.theme.NeonPurple

@Composable
fun PixoraLogo(
    modifier: Modifier = Modifier,
    isAnimating: Boolean = true
) {
    val infiniteTransition = rememberInfiniteTransition(label = "logo_animation")

    val rotation by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(8000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "rotation"
    )

    val scale by infiniteTransition.animateFloat(
        initialValue = 0.95f,
        targetValue = 1.05f,
        animationSpec = infiniteRepeatable(
            animation = tween(2000, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "scale"
    )

    Box(modifier = modifier.size(120.dp)) {
        Canvas(modifier = Modifier.matchParentSize()) {
            val center = Offset(size.width / 2, size.height / 2)
            val radius = (size.width / 2) * if (isAnimating) scale else 1f

            val gradientBrush = Brush.sweepGradient(
                colors = listOf(LiquidBlue, NeonPurple, CinematicCyan, LiquidBlue),
                center = center
            )

            drawCircle(
                brush = gradientBrush,
                radius = radius * 0.8f,
                center = center,
                style = Stroke(width = 8.dp.toPx())
            )

            drawCircle(
                color = com.pixora.core.ui.theme.AdaptiveGlassDark,
                radius = radius * 0.6f,
                center = center
            )

            val innerGradient = Brush.radialGradient(
                colors = listOf(Color.White, Color.Transparent),
                center = center,
                radius = radius * 0.5f
            )

            drawCircle(
                brush = innerGradient,
                radius = radius * 0.5f,
                center = center
            )
        }
    }
}
