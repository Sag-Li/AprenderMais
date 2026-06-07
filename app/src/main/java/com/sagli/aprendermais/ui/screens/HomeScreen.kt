package com.sagli.aprendermais.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*

import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

import androidx.lifecycle.viewmodel.compose.viewModel

import com.sagli.aprendermais.data.Course
import com.sagli.aprendermais.ui.components.CourseCard
import com.sagli.aprendermais.viewmodel.CourseViewModel

@Composable
fun HomeScreen(
    onCourseClick: (Course) -> Unit,
    viewModel: CourseViewModel = viewModel()
) {

    val courses by viewModel.courses.collectAsState()

    var searchText by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        Text(
            text = "Aprender+",
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        )

        Text(
            text = "Explore cursos técnicos e profissionalizantes.",
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            textAlign = TextAlign.Center
        )

        OutlinedTextField(
            value = searchText,
            onValueChange = {

                searchText = it
                viewModel.search(it)

            },
            label = {
                Text("Buscar curso")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )

        if (courses.isEmpty()) {

            Column(
                modifier = Modifier.padding(24.dp)
            ) {

                Text(
                    "Nenhum curso encontrado"
                )

                Text(
                    "Ajuste a busca."
                )
            }

        } else {

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),

                modifier = Modifier.fillMaxSize(),

                contentPadding =
                    PaddingValues(
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 100.dp
                    ),

                verticalArrangement =
                    Arrangement.spacedBy(12.dp),

                horizontalArrangement =
                    Arrangement.spacedBy(12.dp)

            ) {

                items(courses) { course ->

                    CourseCard(
                        course = course,
                        onClick = {
                            onCourseClick(course)
                        }
                    )
                }
            }
        }
    }
}