package com.sagli.aprendermais.data

data class Course(
    val id: Int,
    val title: String,
    val category: String,
    val workload: String,
    val rating: Double,
    val instructor: String,
    val description: String
)