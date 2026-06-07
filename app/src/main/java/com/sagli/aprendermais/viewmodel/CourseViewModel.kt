package com.sagli.aprendermais.viewmodel

import androidx.lifecycle.ViewModel
import com.sagli.aprendermais.data.Course
import com.sagli.aprendermais.data.CourseRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CourseViewModel : ViewModel() {

    private val allCourses = CourseRepository.courses

    private val _courses =
        MutableStateFlow(allCourses)

    val courses: StateFlow<List<Course>> = _courses

    private val _enrolledCourses =
        MutableStateFlow<List<Course>>(emptyList())

    val enrolledCourses: StateFlow<List<Course>> =
        _enrolledCourses

    fun search(text: String) {

        if (text.isBlank()) {

            _courses.value = allCourses

        } else {

            _courses.value =
                allCourses.filter {

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

    fun enroll(course: Course) {

        if (!_enrolledCourses.value.contains(course)) {

            _enrolledCourses.value =
                _enrolledCourses.value + course
        }
    }
}