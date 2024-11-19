
# Descriptif de projet : Plateforme de gestion de cinémas

## **Contexte**
Vous devez réaliser un projet visant à concevoir une **plateforme de gestion de cinémas**. Ce projet permettra de mettre en pratique vos compétences en développement backend avec Spring Boot et de vous familiariser avec la gestion des données à l’aide de JPA/Hibernate et H2.

## **Objectifs du projet**
Développement d’une plateforme complète pour l’administration et la visualisation des éléments liés à un cinéma.


### **Cahier des charges fonctionnel**
La plateforme devra inclure les features suivantes :
- **Gestion des films** :
    - Ajouter, modifier, supprimer des films (titre, description, durée, affiche, etc.).
    - Visualiser la liste des films disponibles.
- **Gestion des séances** :
    - Planification des séances (film, salle, horaires).
    - Visualisation des horaires et des films par salle.
- **Gestion des salles** :
    - Ajouter, modifier, supprimer des salles (nom, capacité).
    - Visualiser la liste des salles.
- **Interface utilisateur** :  Une interface simple permettant de naviguer entre les différentes sections.

**Technologies à utiliser** :
- Spring Boot (LTS).
- JPA / Hibernate pour la gestion de la persistance.
- Base de données embarquée H2 pour simplifier le développement et les tests.
- Spring Web pour gérer les requêtes et endpoints REST.
- Durée estimée : 10 heures.

### **Critères d’évaluation**
- **Respect des fonctionnalités demandées**.
- **Interfaces** :
    - L'UI devra être soignée, elle peut être très minimaliste ou vous pouvez vous appuyer sur des template d'admin comme [AdminLTE](https://adminlte.io/) ou [SBAdmin](https://startbootstrap.com/theme/sb-admin-2)
- **Qualité du code** : Respect des bonnes pratiques (nommage, structuration, modularité, architecture, packages).
- **Documentation claire** :
    - README complet et explicite.
    - Vidéo de démonstration professionnelle.
- **Originalité des ajouts** (bonus)
    - Ajouter une preview des films
    - Mettre en place un système basique de streaming
    - Mise en place d'un moteur de recommandation
- **Malus en cas de** :
    - Retard
    - Non respect des règles de livraison
    - Plagiat (vous pouvez utiliser du code que vous trouvez, si vous le comprenez et que vous citez vos sources, reprendre le projet d'un autre groupe entrainera une note nulle pour les groupes concernés)

### **Livrables attendus**
1. **Code source** (hébergé sur le dépôt Git associé à l'assignment pour ce projet, uniquement).
2. **Fichier README** :
    - Présentation du projet.
        - Description du projet.
        - Versions des librairies utilisées.
        - Étapes pour configurer et exécuter le projet.
3. **Vidéo de démonstration** (5 minutes max).
4. **Bilan** écrit, précisant :
    - Les choix techniques.
    - Les difficultés rencontrées et leur résolution.