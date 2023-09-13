# Santander Dev Week 2023

Java RESTful Api criada para a Santander Dev Week

## Diagramas de Classes

```mermaid
classDiagram
    class User {
        +Number userId
        +String name
        +Account account
        +Feature[] Feature
        +Card card
        +Article[] article
    }
     class Account {
        +Number accountId
        +String number
        +String agency
        +Number balance
        +Number limit
    }

     class Feature {
        +Number featureId
        +String icon
        +String description
    }

     class Card {
        +Number cardId
        +String number
        +Number limit
    }

     class Article {
        +Number articleId
        +String icon
        +String description
    }
    
    User "1" *-- "1" Account
    User "1" *-- "n" Feature
    User "1" *-- "1" Card
    User "1" *-- "n" Article

```
