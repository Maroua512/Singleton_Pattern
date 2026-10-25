# Singleton Pattern

Le patron Singleton est un patron de création qui permet de garantir qu'une
classe ne possède qu'une seule instance et de fournir un point d'accès global
à cette instance.

## Utilisation

Ce patron est utile lorsqu'une seule instance d'une classe est nécessaire, par
exemple pour contrôler l'accès à une ressource partagée.

## Architecture UML

```mermaid
classDiagram
    class Liasse {
        -documents : List~Document~
        +ajoute(doc : Document) void
        +imprime() void
    }

    class LiasseVierge {
        -instance : LiasseVierge
        +getInstance() LiasseVierge
        +getDocuments() List~Document~
    }

    class LiasseClient {
        +creeLiasse(documentations : List~Document~) Liasse
    }

    class Document {
        <<abstract>>
        +imprime() void
    }

    class Cloneable {
        <<interface>>
    }

    class BonDeCommande
    class CertificatSession
    class DemandeImmatriculation

    Document ..|> Cloneable
    Document <|-- BonDeCommande
    Document <|-- CertificatSession
    Document <|-- DemandeImmatriculation

    Liasse o-- Document : contient
    Liasse <|-- LiasseClient
    Liasse <|-- LiasseVierge
```

### Rôle des classes

- **Liasse** : classe de base qui agrège les documents.
- **LiasseVierge** : singleton dérivé de `Liasse` qui contient la liste de
  documents types.
- **LiasseClient** : classe dérivée de `Liasse` pour représenter la liasse d'un
  client.
- **Document** et ses sous-classes : représentent les documents imprimables.
