# jOOQ 찍먹 프로젝트

이 레포지토리는 자바와 스프링부트 환경에서 [jOOQ](https://www.jooq.org/)를 사용해 SQL 생성을 학습하기 위해 만들어졌습니다. jOOQ를 통해 데이터베이스와 상호작용하며 복잡한 SQL 쿼리를 자바 코드로 작성하는 방법을 다룹니다.

## 기술 스택

- **Java 17**  
  최신 Java 기능을 사용해 jOOQ를 효과적으로 구현합니다.

- **Spring Boot**  
  빠르고 효율적인 애플리케이션 구성을 위한 Spring Boot 기반 설정.

- **MySQL**  
  MySQL 데이터베이스를 활용하여 실제 데이터로 쿼리 연습.

- **Sakila DB**  
  MySQL의 대표 샘플 데이터베이스인 [Sakila DB](https://dev.mysql.com/doc/sakila/en/)를 사용하여 jOOQ 쿼리를 연습합니다.

- **Docker**  
  컨테이너화된 MySQL 환경을 위해 Docker 사용. (`docker-compose` 설정 포함)

## 프로젝트 실행

1. **Docker로 MySQL 환경 설정**
   ```bash
   docker-compose up -d

## 주요 학습 목표
- jOOQ의 코드 생성 기능을 사용하여 타입 안전한 SQL 쿼리를 자바 코드로 작성
- 다양한 SQL 쿼리 및 조인 작업을 jOOQ를 통해 학습
- MySQL과 jOOQ 연동 및 성능 최적화 방법 익히기
