# Sandra Library API

[![Java CI with Maven](https://github.com/sammy-regina/sandra-library-api/actions/workflows/ci.yml/badge.svg?branch=main)](https://github.com/sammy-regina/sandra-library-api/actions/workflows/ci.yml)

API resiliente para gestão de bibliotecas escolares, focada em automação, qualidade de código e conformidade com LGPD.

##  Tecnologias e Conceitos
- **Java 21**: Uso de Virtual Threads e Records para performance e legibilidade.
- **Spring Boot 3**: Framework base para microserviços.
- **GitHub Actions**: Pipeline de CI/CD configurado para validação automática de build.
- **Design for Failure**: Implementação de resiliência e validação rigorosa de dados.
- **Clean Code & SOLID**: Arquitetura organizada por responsabilidades.

##  Como rodar o projeto
```bash
./mvnw clean install
./mvnw spring-boot:run