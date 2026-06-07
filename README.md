#  Catálogo Aprender+

Aplicação web/mobile de catálogo de cursos técnicos e profissionalizantes, com foco em navegação simples, busca eficiente e visualização de detalhes.

---

## 🚀 Demonstração

O sistema permite ao usuário:
- Explorar uma lista de cursos
- Buscar cursos por nome
- Selecionar cursos
- Visualizar detalhes completos
- Navegar entre telas de forma fluida

---

##  Objetivo do projeto

Este projeto foi desenvolvido para praticar:

- Estruturação de interfaces com listas dinâmicas
- Manipulação de estado (seleção e busca)
- Navegação entre telas
- Organização de componentes reutilizáveis
- Experiência de usuário em catálogos

---

## Funcionalidades

### Catálogo de cursos
- Lista com 12 cursos
- Exibição em formato de cards
- Informações principais visíveis:
  - Nome do curso
  - Categoria
  - Nível
  - Nota

### Busca inteligente
- Busca por nome completo ou parcial
- Suporte a maiúsculas e minúsculas
- Atualização dinâmica dos resultados
- Mensagem de estado vazio quando não há resultados

###  Seleção de curso
- Destaque visual do item selecionado
- Apenas um item selecionado por vez
- Estado centralizado e consistente

###  Navegação
- Clique em um curso abre a tela de detalhe
- Navegação baseada em `cursoId`
- Botão de voltar funcional
- Sem passagem de objeto completo na rota

###  Tela de detalhe
- Exibe todas as informações do curso
- Inclui:
  - Nome completo e breve
  - Categoria e nível
  - Carga horária e status
  - Progresso
  - Descrição completa
- Suporte a conteúdo longo com rolagem
- Tratamento para curso inexistente

---

## Checklist de testes

###  Inicialização
- [x] O app abre sem crash  
- [x] Exibe "Catálogo Aprender+"  
- [x] Exibe "Explore cursos técnicos e profissionalizantes."  
- [x] Lista inicial com pelo menos 12 cursos  
- [x] Rolagem vertical funcionando  

### Lista de cursos
- [x] Todos os cursos exibidos em cards  
- [x] Informações completas em cada card  
- [x] Interface responsiva e organizada  
- [x] Sem travamentos durante rolagem  

### Busca
- [x] Busca por nome completo funciona  
- [x] Busca por parte do nome funciona  
- [x] Maiúsculas e minúsculas suportadas  
- [x] Limpeza de busca restaura lista  
- [x] Mensagem de “nenhum curso encontrado”  

###  Seleção
- [x] Seleção visual ativa  
- [x] Apenas um item selecionado  
- [x] Estado centralizado  
- [x] Não quebra com atualização da lista  

###  Navegação
- [x] Navegação para detalhe funciona    
- [x] Botão voltar funcional  
- [x] Sem crash ao navegar repetidamente  

###  Detalhe do curso
- [x] Exibição completa de informações  
- [x] Layout com rolagem  
- [x] Tratamento de curso inexistente  
- [x] Texto de trilha Aprender+ exibido  

### Usabilidade
- [x] Espaçamento adequado entre elementos  
- [x] Botões com boa área de toque  
- [x] Navegação intuitiva  

---
