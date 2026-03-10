package com.ues.listadetareas

import android.os.Bundle
import android.util.Log
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
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.ues.listadetareas.data.AppDatabase
import com.ues.listadetareas.data.TaskEntity
import com.ues.listadetareas.ui.TaskApp
import com.ues.listadetareas.ui.theme.ListaDeTareasTheme
import com.ues.listadetareas.ui.theme.TaskListScreen
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "tasks_db"
        ).build()

        val dao = db.taskDao()

        lifecycleScope.launch {
            dao.insertTask(TaskEntity(title = "Prueba 1"))
            val items = dao.getTasks()
            Log.d("ROOM", "Tareas almacenadas: $items")
        }

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

