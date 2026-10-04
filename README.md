🏢 Prison Management System

A Java-based Prison Management System designed to manage prisoners, crimes, cells, guards, lawyers, and prisoner records.

Originally developed as a university project, the system was later improved and reorganized as a portfolio project to demonstrate practical Java and Object-Oriented Programming skills.

---

📌 Features

- 👤 Prisoner management
- ⚖️ Crime and sentence management
- 🏠 Cell management
- 👮 Guard management
- 👨‍⚖️ Lawyer management
- 📋 Prisoner records
- 🏥 Medical records
- 🔐 Security levels and behavior ratings
- 🔗 Relationships between different system entities

---

🧠 OOP Concepts

The project demonstrates several core Object-Oriented Programming concepts:

- 🔒 Encapsulation
- 🌳 Inheritance
- 🔄 Polymorphism
- 🔁 Method Overriding
- 🔀 Method Overloading
- 🏗️ Constructors
- 🎯 Getters and Setters
- 🔐 Access Modifiers

🔗 Class Relationships

The system also demonstrates different types of relationships between classes:

- Association
- Aggregation
- Composition
- Inheritance
- Dependency

📊 Main Class Structure

                    Person
                  /    |    \
                 /     |     \
          Prisoner    Guard   Lawyer
             |
             |
      PrisonerRecord
             |
             |
   PrisonerMedicalRecord

Prisoners are also associated with entities such as "Crime", "Cell", and "Lawyer".

---

📁 Project Structure

Prison Management System/
│
├── PMS/
│   ├── Person.java
│   ├── Prisoner.java
│   ├── Guard.java
│   ├── Lawyer.java
│   ├── Crime.java
│   ├── Cell.java
│   ├── PrisonerRecord.java
│   ├── PrisonerMedicalRecord.java
│   └── PrisonManagementSystem.java
│
├── UML/
│   └── PMS-UML.jpeg
│
├── Prison Management System.pptx
├── README.md
└── .gitignore

---

🛠️ Technologies

- ☕ Java
- 🧠 Object-Oriented Programming (OOP)
- 📐 UML
- 💻 Visual Studio Code
- 🐙 Git & GitHub

---

▶️ How to Run

1. Clone the repository.
2. Open the project in a Java-compatible IDE.
3. Open the "PMS" folder.
4. Run "PrisonManagementSystem.java".

---

📐 UML Diagram

The UML diagram is available in the "UML" folder and illustrates the main classes and their relationships.

---

🎯 Purpose

This project demonstrates the practical application of Java and OOP concepts by building a structured management system with multiple interacting classes and different types of relationships.

---

👨‍💻 Author

Amro Alboorene

Software Engineering Student — Zarqa University
