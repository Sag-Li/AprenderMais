package com.sagli.aprendermais.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*

import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

import com.sagli.aprendermais.data.Course
import com.sagli.aprendermais.ui.screens.DetailScreen
import com.sagli.aprendermais.ui.screens.HomeScreen
import com.sagli.aprendermais.ui.screens.MyCoursesScreen
import com.sagli.aprendermais.ui.screens.ProfileScreen
import com.sagli.aprendermais.viewmodel.CourseViewModel

@Composable
fun AppNavigation() {

    val courseViewModel: CourseViewModel = viewModel()

    var currentScreen by remember {
        mutableStateOf("home")
    }

    var selectedCourse by remember {
        mutableStateOf<Course?>(null)
    }

    if (selectedCourse != null) {

        DetailScreen(
            course = selectedCourse!!,
            viewModel = courseViewModel,
            onBack = {
                selectedCourse = null
            }
        )

    } else {

        Scaffold(

            bottomBar = {

                NavigationBar {

                    NavigationBarItem(
                        selected = currentScreen == "home",
                        onClick = {
                            currentScreen = "home"
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Default.Home,
                                contentDescription = null
                            )
                        },
                        label = {
                            Text("Início")
                        }
                    )

                    NavigationBarItem(
                        selected = currentScreen == "courses",
                        onClick = {
                            currentScreen = "courses"
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Default.School,
                                contentDescription = null
                            )
                        },
                        label = {
                            Text("Cursos")
                        }
                    )

                    NavigationBarItem(
                        selected = currentScreen == "profile",
                        onClick = {
                            currentScreen = "profile"
                        },
                        icon = {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = null
                            )
                        },
                        label = {
                            Text("Estudante")
                        }
                    )
                }
            }

        ) { paddingValues ->

            when (currentScreen) {

                "home" -> {

                    HomeScreen(
                        onCourseClick = {
                            selectedCourse = it
                        },
                        viewModel = courseViewModel
                    )
                }

                "courses" -> {

                    MyCoursesScreen(
                        viewModel = courseViewModel,
                        onCourseClick = {
                            selectedCourse = it
                        }
                    )
                }

                "profile" -> {

                    ProfileScreen(
                        viewModel = courseViewModel
                    )
                }
            }
        }
    }
}