package com.sagli.aprendermais.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sagli.aprendermais.ui.components.CourseCard
import com.sagli.aprendermais.viewmodel.CourseViewModel
import com.sagli.aprendermais.data.Course

@Composable
fun MyCoursesScreen(
    viewModel: CourseViewModel,
    onCourseClick: (Course) -> Unit,
) {

    val courses by viewModel.enrolledCourses.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Meus Cursos",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "${courses.size} cursos matriculados"
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(top = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            items(courses) { course ->

                CourseCard(
                    course = course,
                ) {
                    onCourseClick(course)
                }
            }
        }
    }
}