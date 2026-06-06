package com.sagli.aprendermais.viewmodel

import androidx.lifecycle.ViewModel
import com.sagli.aprendermais.data.Course
import com.sagli.aprendermais.data.CourseRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CourseViewModel : ViewModel() {

    private val _courses =
        MutableStateFlow(CourseRepository.courses)

    val courses: StateFlow<List<Course>> = _courses

    fun search(text: String) {

        if (text.isBlank()) {

            _courses.value = CourseRepository.courses

        } else {

            _courses.value =
                CourseRepository.courses.filter {

                    it.title.contains(
                        text,
                        ignoreCase = true
                    ) ||

                            it.category.contains(
                                text,
                                ignoreCase = true
                            )
                }
        }
    }
}