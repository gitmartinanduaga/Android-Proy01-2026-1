package com.ues.listadetareas.ui


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ues.listadetareas.domain.Task
import com.ues.listadetareas.ui.theme.TaskListScreenContent

@Composable
fun MainContent(
    viewModel: TaskViewModel, 
    onEditTask: (Task) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxSize()) {
        TaskListScreen(viewModel, onEditTask)
    }
}

@Composable
fun TaskListScreen(x0: TaskViewModel, x1: (Task) -> Unit) {
    TODO("Not yet implemented")
}
