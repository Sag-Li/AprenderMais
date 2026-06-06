package com.sagli.aprendermais.navigation

import androidx.compose.runtime.*
import com.sagli.aprendermais.data.Course
import com.sagli.aprendermais.ui.screens.DetailScreen
import com.sagli.aprendermais.ui.screens.HomeScreen

@Composable
fun AppNavigation() {

    var selectedCourse by remember {
        mutableStateOf<Course?>(null)
    }

    if (selectedCourse == null) {

        HomeScreen(
            onCourseClick = {
                selectedCourse = it
            }
        )

    } else {

        DetailScreen(
            course = selectedCourse!!
        )

    }
}