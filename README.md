# Soccer Team Management System

## Overview

The Soccer Team Management System is a Java application designed to manage soccer teams, including players and coaches. It allows for the creation of teams, addition and removal of players, and assignment of coaches. The system ensures data integrity by implementing deep copying techniques for player and coach objects.

## Features

- Creation of soccer teams with up to 11 players.
- Addition and removal of players from teams.
- Assignment of coaches to teams.
- Implementation of deep copying for player and coach objects to maintain data integrity.
- Singleton pattern used for coaches to ensure only one instance exists in the system.

## Code Structure

The project consists of the following classes:

- `SoccerTeam`: Represents a soccer team, containing an array of players and a coach.
- `Player`: Represents a player with attributes such as name, number, and role.
- `Coach`: Represents a coach with attributes including name, years of experience, and expertise level.

## Installation

To use the Soccer Team Management System, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Compile the code.
4. Run the application.

## Usage

Below are some examples of how to use the Soccer Team Management System:

1. Create a new soccer team:

```java
SoccerTeam team = SoccerTeam.getInstance();
