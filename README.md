# Gestion des missions d’une entreprise

## Description
Application Java permettant de gérer les employés d’une entreprise, les projets et les missions réalisées. Elle permet de calculer le coût des missions et de représenter les relations hiérarchiques entre les employés.

## Objectifs
- Mettre en pratique l’héritage et le polymorphisme.
- Utiliser les classes abstraites.
- Gérer les associations entre classes.
- Implémenter une association réflexive pour la hiérarchie des employés.
- Manipuler des tableaux d’objets en Java.

## Structure du projet

```text
entreprise/
├── Employe.java
├── Ingenieur.java
├── Commercial.java
├── Projet.java
├── Mission.java
└── Main.java
```

## Description des classes

### 1. Employe
Classe abstraite contenant les attributs communs aux employés :
- `matricule`
- `nom`
- `tarifJournalier`
- `superieur`

Elle définit les méthodes de calcul du coût, d’affichage des détails et de gestion du supérieur hiérarchique.

### 2. Ingenieur
Classe qui hérite de `Employe`. Elle possède un niveau d’expertise.

- Si le niveau est inférieur à 3, le coût est égal au tarif journalier multiplié par le nombre de jours.
- Si le niveau est supérieur ou égal à 3, un supplément de 100 DH par jour est ajouté.

### 3. Commercial
Classe qui hérite de `Employe` et possède un taux de prime. Le coût de la mission comprend le montant de base et la prime correspondante.

### 4. Projet
Classe représentant un projet avec un code et un intitulé. La méthode `toString()` permet d’afficher ses informations.

### 5. Mission
Classe associant un employé à un projet pour une durée déterminée. Elle permet de calculer le montant de la mission et d’afficher son récapitulatif.

### 6. Main
Classe principale permettant de créer les employés et les projets, de définir les relations hiérarchiques, de créer les missions et d’afficher les résultats.

## Données de test

| Employé | Tarif journalier | Caractéristique | Durée |
|---|---:|---|---:|
| Ingénieur 1 | 500 DH | Niveau 4 | 3 jours |
| Ingénieur 2 | 350 DH | Niveau 2 | 2 jours |
| Commercial 1 | 300 DH | Prime de 10 % | 4 jours |
| Commercial 2 | 400 DH | Prime de 15 % | 2 jours |

## Résultats attendus

| Mission | Montant |
|---|---:|
| Ingénieur 1 | 1 800 DH |
| Ingénieur 2 | 700 DH |
| Commercial 1 | 1 320 DH |
| Commercial 2 | 920 DH |
| **Montant total** | **4 740 DH** |

Le premier ingénieur supervise directement deux employés : le deuxième ingénieur et le premier commercial.

## Technologies utilisées
- Java
- Eclipse IDE
- Programmation orientée objet (POO)

## Exécution
1. Importer ou ouvrir le projet dans Eclipse.
2. Vérifier que les six classes se trouvent dans le package `entreprise`.
3. Exécuter `Main.java` avec **Run As → Java Application**.
4. Consulter les résultats dans la console.

## Auteur
Projet réalisé dans le cadre des travaux pratiques de Java.
<img width="960" height="540" alt="image" src="https://github.com/user-attachments/assets/a54db835-308e-416c-b18d-ea44692bd9a1" />

