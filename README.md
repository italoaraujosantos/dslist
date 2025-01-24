# Project DsList 

## Description: 
- Organization Game list, project developer in Java 21 LTS usaded Springboot 3.4.7 com persistence data in PostgresSQL

## Domain Model 
![Modelo de domínio DSList](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

## Endpoints  API

### List all games
GET - http://localhost:8080/games

### List all category of Games
GET - http://localhost:8080/lists

### List games for category
GET - http://localhost:8080/lists/{id}/games

### Search game by id
GET - http://localhost:8080/games/{id}

### Order alter position of the game
POST - http://localhost:8080/lists/{id}/replacement


