package com.ues.listadetareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.room.Room
import com.ues.listadetareas.data.AppDatabase
import com.ues.listadetareas.data.repository.TaskRepositoryImpl
import com.ues.listadetareas.ui.TaskApp
import com.ues.listadetareas.data.TaskViewModel
import com.ues.listadetareas.data.TaskViewModelFactory
import com.ues.listadetareas.ui.theme.ListaDeTareasTheme

class MainActivity : ComponentActivity() {

    private val db by lazy {
        Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "tasks_db"
        ).build()
    }

    private val repository by lazy { TaskRepositoryImpl(db.taskDao()) }
    
    private val viewModel: TaskViewModel by viewModels {
        TaskViewModelFactory(repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            ListaDeTareasTheme {
                TaskApp(viewModel)
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun VistaPrevia() {
    ListaDeTareasTheme {
        // En preview no podemos pasar el ViewModel real fácilmente
        // TaskApp()
    }
}
