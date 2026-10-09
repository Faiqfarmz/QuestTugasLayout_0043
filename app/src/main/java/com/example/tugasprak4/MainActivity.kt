package com.example.tugasprak4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.tugasprak4.ui.theme.AktivitasPertama
import com.example.tugasprak4.ui.theme.TugasPrak4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            TugasPrak4Theme {
                AktivitasPertama(
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}