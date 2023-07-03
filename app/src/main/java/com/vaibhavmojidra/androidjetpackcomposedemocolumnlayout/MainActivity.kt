package com.vaibhavmojidra.androidjetpackcomposedemocolumnlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.vaibhavmojidra.androidjetpackcomposedemocolumnlayout.ui.theme.AndroidJetpackComposeDemoColumnLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidJetpackComposeDemoColumnLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .background(color = Color.LightGray)
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Greeting("Vaibhav Mojidra")
                        Greeting("Vaibhav Mojidra 2")
                        Greeting("Vaibhav Mojidra 3")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "$name",
        textAlign = TextAlign.Center,
        color = Color.Red,
        modifier = Modifier
            .background(Color.Cyan)
            .border(2.dp, color = Color.Black)
            .padding(5.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidJetpackComposeDemoColumnLayoutTheme {
        Greeting("Android")
    }
}