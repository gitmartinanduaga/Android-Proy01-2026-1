package com.ues.listadetareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ues.listadetareas.ui.TaskApp
import com.ues.listadetareas.ui.theme.ListaDeTareasTheme
import com.ues.listadetareas.ui.theme.TaskListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            TaskApp()

        }
    }
}


@Preview(showBackground = true)
@Composable
fun VistaPrevia() {
    ListaDeTareasTheme {
        TaskApp()
    }
}

