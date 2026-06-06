package com.sagli.aprendermais.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sagli.aprendermais.data.Course

@Composable
fun DetailScreen(
    course: Course
) {

    var enrolled by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Card(
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Icon(
                    imageVector = Icons.Default.School,
                    contentDescription = null
                )

                Spacer(
                    modifier = Modifier.height(12.dp)
                )

                Text(
                    text = course.title,
                    style = MaterialTheme.typography.headlineSmall
                )

                Text(
                    text = course.category
                )

                Spacer(
                    modifier = Modifier.height(8.dp)
                )

                Text(
                    text = "⭐ ${course.rating}"
                )
            }
        }

        Spacer(
            modifier = Modifier.height(24.dp)
        )

        Text(
            text = "Instrutor",
            style = MaterialTheme.typography.titleMedium
        )

        Text(course.instructor)

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Text(
            text = "Carga Horária",
            style = MaterialTheme.typography.titleMedium
        )

        Text(course.workload)

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Text(
            text = "Descrição",
            style = MaterialTheme.typography.titleMedium
        )

        Text(course.description)

        Spacer(
            modifier = Modifier.height(32.dp)
        )

        Button(
            onClick = {
                enrolled = true
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