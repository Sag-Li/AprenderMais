package com.sagli.aprendermais.data

data class Course(
    val id: Int,
    val title: String,
    val shortName: String,
    val category: String,
    val level: String,
    val workload: String,
    val status: String,
    val progress: Int,
    val rating: Double,
    val instructor: String,
    val description: String
)