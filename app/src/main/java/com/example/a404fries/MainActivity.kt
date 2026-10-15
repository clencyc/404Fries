package com.example.a404fries


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.a404fries.ui.theme.SaharaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { SaharaTheme { Preview() } }
    }
}

@Composable
private fun Preview() {
    var email by remember { mutableStateOf("") }
    Scaffold(containerColor = MaterialTheme.colorScheme.background) { padding ->
        Column(
            Modifier
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 24.dp, vertical = 48.dp),
            verticalArrangement = Arrangement.spacedBy(32.dp),
        ) {
            Text("Sun-baked simplicity", style = MaterialTheme.typography.displaySmall)
            Text(
                "Curated, not cluttered. Whitespace does the work.",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
            SaharaCard(Modifier.fillMaxWidth()) {
                Text("Join the list", style = MaterialTheme.typography.headlineSmall)
                Spacer(Modifier.height(20.dp))
                SaharaTextField(email, { email = it }, "Email", Modifier.fillMaxWidth())
                Spacer(Modifier.height(20.dp))
                Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                    SaharaPrimaryButton("Continue", {})
                    SaharaSecondaryButton("Later", {})
                }
            }
        }
    }
}