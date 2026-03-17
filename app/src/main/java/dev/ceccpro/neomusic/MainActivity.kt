package dev.ceccpro.neomusic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import dev.ceccpro.neomusic.ui.screens.MainScreen
import dev.ceccpro.neomusic.ui.theme.NeoMusicTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NeoMusicTheme {
                MainScreen()
            }
        }
    }
}

