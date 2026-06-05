package com.seunome.aprendermais.data

object CourseRepository {

    val courses = listOf(

        Course(
            id = 1,
            title = "Kotlin para Desenvolvimento Android",
            category = "Programação",
            workload = "20h",
            description = "Aprenda os fundamentos da linguagem Kotlin, incluindo orientação a objetos, funções, coleções e boas práticas para o desenvolvimento de aplicativos Android modernos."
        ),

        Course(
            id = 2,
            title = "Jetpack Compose Essentials",
            category = "Programação",
            workload = "30h",
            description = "Desenvolva interfaces declarativas utilizando Jetpack Compose, aplicando componentes Material Design 3, gerenciamento de estado e navegação entre telas."
        ),

        Course(
            id = 3,
            title = "Git e GitHub para Equipes Ágeis",
            category = "Ferramentas",
            workload = "15h",
            description = "Domine versionamento de código, fluxos de trabalho colaborativos, branches, pull requests e integração com repositórios remotos."
        ),

        Course(
            id = 4,
            title = "Banco de Dados SQL",
            category = "Dados",
            workload = "25h",
            description = "Aprenda modelagem relacional, consultas SQL, normalização de dados e operações de manipulação utilizadas em aplicações corporativas."
        ),

        Course(
            id = 5,
            title = "Arquitetura Android Moderna",
            category = "Programação",
            workload = "40h",
            description = "Explore padrões arquiteturais como MVVM, gerenciamento de estado, injeção de dependência e organização escalável de projetos Android."
        ),

        Course(
            id = 6,
            title = "UX Design e Experiência do Usuário",
            category = "Design",
            workload = "18h",
            description = "Entenda os princípios de usabilidade, acessibilidade e pesquisa com usuários para criar produtos digitais mais eficientes."
        ),

        Course(
            id = 7,
            title = "Prototipação com Figma",
            category = "Design",
            workload = "12h",
            description = "Crie wireframes, protótipos interativos e sistemas de design utilizando uma das principais ferramentas do mercado."
        ),

        Course(
            id = 8,
            title = "Python para Análise de Dados",
            category = "Programação",
            workload = "35h",
            description = "Utilize Python para manipulação de dados, automação de tarefas e desenvolvimento de soluções voltadas à análise de informações."
        ),

        Course(
            id = 9,
            title = "Machine Learning na Prática",
            category = "Tecnologia",
            workload = "45h",
            description = "Implemente modelos preditivos utilizando algoritmos supervisionados e não supervisionados aplicados a cenários reais."
        ),

        Course(
            id = 10,
            title = "Fundamentos de Inteligência Artificial",
            category = "Tecnologia",
            workload = "50h",
            description = "Conheça conceitos essenciais de IA, processamento de linguagem natural, visão computacional e aplicações modernas da tecnologia."
        ),

        Course(
            id = 11,
            title = "Power BI para Business Intelligence",
            category = "Dados",
            workload = "22h",
            description = "Construa dashboards interativos, indicadores estratégicos e relatórios analíticos para tomada de decisão baseada em dados."
        ),

        Course(
            id = 12,
            title = "Scrum e Gestão Ágil de Projetos",
            category = "Gestão",
            workload = "10h",
            description = "Aprenda os papéis, cerimônias e artefatos do Scrum para gerenciar projetos de forma iterativa e colaborativa."
        )

    )
}