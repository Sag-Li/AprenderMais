package com.sagli.aprendermais.data

object CourseRepository {

    val courses = listOf(

        Course(
            id = 1,
            title = "Desenvolvimento Android com Kotlin",
            shortName = "Android Kotlin",
            category = "Programação",
            level = "Iniciante",
            workload = "20h",
            status = "Disponível",
            progress = 0,
            rating = 4.9,
            instructor = "João Silva",
            description = "Aprenda Kotlin e Android moderno utilizando Jetpack Compose."
        ),

        Course(
            id = 2,
            title = "Jetpack Compose Completo",
            shortName = "Jetpack Compose",
            category = "Programação",
            level = "Intermediário",
            workload = "30h",
            status = "Disponível",
            progress = 0,
            rating = 4.8,
            instructor = "Maria Costa",
            description = "Crie interfaces modernas e profissionais com Jetpack Compose."
        ),

        Course(
            id = 3,
            title = "Git e GitHub para Equipes",
            shortName = "Git e GitHub",
            category = "Ferramentas",
            level = "Iniciante",
            workload = "15h",
            status = "Disponível",
            progress = 0,
            rating = 4.7,
            instructor = "Pedro Lima",
            description = "Controle de versão e colaboração profissional."
        ),

        Course(
            id = 4,
            title = "Banco de Dados SQL",
            shortName = "SQL",
            category = "Dados",
            level = "Intermediário",
            workload = "25h",
            status = "Disponível",
            progress = 0,
            rating = 4.6,
            instructor = "Ana Souza",
            description = "Aprenda modelagem de dados e consultas SQL."
        ),

        Course(
            id = 5,
            title = "UX Design Profissional",
            shortName = "UX Design",
            category = "Design",
            level = "Iniciante",
            workload = "18h",
            status = "Disponível",
            progress = 0,
            rating = 4.8,
            instructor = "Lucas Alves",
            description = "Crie experiências incríveis para usuários."
        ),

        Course(
            id = 6,
            title = "Inteligência Artificial Moderna",
            shortName = "IA",
            category = "IA",
            level = "Avançado",
            workload = "40h",
            status = "Disponível",
            progress = 0,
            rating = 5.0,
            instructor = "Carla Mendes",
            description = "Fundamentos e aplicações práticas de IA."
        ),

        Course(
            id = 7,
            title = "Desenvolvimento Web Completo",
            shortName = "Web",
            category = "Programação",
            level = "Intermediário",
            workload = "35h",
            status = "Disponível",
            progress = 0,
            rating = 4.7,
            instructor = "Fernanda Rocha",
            description = "HTML, CSS e JavaScript modernos."
        ),

        Course(
            id = 8,
            title = "Python para Ciência de Dados",
            shortName = "Python Dados",
            category = "Dados",
            level = "Intermediário",
            workload = "28h",
            status = "Disponível",
            progress = 0,
            rating = 4.9,
            instructor = "Ricardo Oliveira",
            description = "Análise de dados utilizando Python."
        ),

        Course(
            id = 9,
            title = "Figma para Designers",
            shortName = "Figma",
            category = "Design",
            level = "Iniciante",
            workload = "16h",
            status = "Disponível",
            progress = 0,
            rating = 4.8,
            instructor = "Juliana Martins",
            description = "Prototipação e design profissional."
        ),

        Course(
            id = 10,
            title = "Cybersecurity Essentials",
            shortName = "Cybersecurity",
            category = "Segurança",
            level = "Intermediário",
            workload = "22h",
            status = "Disponível",
            progress = 0,
            rating = 4.7,
            instructor = "Gustavo Pereira",
            description = "Fundamentos de segurança digital."
        ),

        Course(
            id = 11,
            title = "Cloud Computing",
            shortName = "Cloud",
            category = "Infraestrutura",
            level = "Intermediário",
            workload = "32h",
            status = "Disponível",
            progress = 0,
            rating = 4.9,
            instructor = "Bruno Santos",
            description = "Computação em nuvem na prática."
        ),

        Course(
            id = 12,
            title = "Gestão de Projetos Ágeis",
            shortName = "Projetos Ágeis",
            category = "Gestão",
            level = "Intermediário",
            workload = "24h",
            status = "Disponível",
            progress = 0,
            rating = 4.8,
            instructor = "Patrícia Gomes",
            description = "Scrum, Kanban e metodologias ágeis."
        )
    )

    fun getCourseById(id: Int): Course? {
        return courses.find { it.id == id }
    }
}