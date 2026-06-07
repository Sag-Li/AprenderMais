package com.sagli.aprendermais.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sagli.aprendermais.data.Course
import com.sagli.aprendermais.viewmodel.CourseViewModel

@Composable
fun DetailScreen(
    course: Course,
    viewModel: CourseViewModel,
    onBack: () -> Unit
) {

    var enrolled by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(
                rememberScrollState()
            )
            .padding(20.dp)
    ) {

        Button(
            onClick = onBack
        ) {
            Text("← Voltar")
        }

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(
            text = "Detalhe do curso",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(
            text = course.title,
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        Text("Nome breve: ${course.shortName}")
        Text("Categoria: ${course.category}")
        Text("Nível: ${course.level}")
        Text("Carga horária: ${course.workload}")
        Text("Status: ${course.status}")
        Text("Progresso: ${course.progress}%")
        Text("Professor: ${course.instructor}")
        Text("Avaliação: ⭐ ${course.rating}")

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(course.description)

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(
            "Este curso faz parte da trilha Aprender+."
        )

        Spacer(
            modifier = Modifier.height(32.dp)
        )

        Button(
            onClick = {
                enrolled = true
                viewModel.enroll(course)
            },
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(
                if (enrolled)
                    "Matriculado ✓"
                else
                    "Matricular-se"
            )
        }
    }
}