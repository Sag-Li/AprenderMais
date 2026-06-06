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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sagli.aprendermais.data.Course
import com.sagli.aprendermais.ui.components.CourseCard
import com.sagli.aprendermais.viewmodel.CourseViewModel
import androidx.compose.ui.text.style.TextAlign
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
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp),
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
                .padding(horizontal = 16.dp)
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
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