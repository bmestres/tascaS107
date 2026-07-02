# Assignment S107

## General info:

**Project description**:
This project uses annotations in Java, a functionality that allows to add metadata to source code to influence its 
behavior or enrich it with additional information. 

**Technologies**: Backend Java

**Prerequisites:**
* **Java SDK**: Version 26 (or the specific version you defined in `<maven.compiler.source>` inside your `pom.xml`).
* **Maven**: Required to download external dependencies (Jackson for JSON serialization and JUnit for testing).


**Installation and Compilation**:
1. Clone repository:
   `git clone https://github.com/bmestres/tascaS107.git`
2. Navigate to the project root directory:
   `cd tascaS107`
3. Resolve dependencies and compile the project using Maven:
   `mvn clean compile`

**Running the Tests**:
To execute the automated JUnit tests, run the following command from the root directory:
`mvn test`

## Level 1: 
Use of annotations integrated into Java, such as @Override and @Deprecated, to improve the clarity and maintenance of 
code. Done within a class hierarchy, inheritance and polymorphism.

### Exercise 1:
**Description:** This assessment creates a hierarchy of objects with three classes: Worker, Online Worker and Face-to-face Worker.
Then uses annotations to override the method to compute the salary
for each type of worker.

**Compilation:**
javac -d target/classes src/main/java/nivell01/exercici01/*.java

**Execution:**
java -cp target/classes nivell01.exercici01.Main

### Exercise 2:
**Description:** This assessment adds some deprecated methods to the child classes, and uses the corresponding annotation. 
It invokes outdated methods from an external class, deleting warnings by the corresponding annotation to be obsolete.

**Compilation:**
javac -d target/classes src/main/java/nivell01/exercici02/*.java

**Execution:**
java -cp target/classes nivell01.exercici02.Main

## Level 2:
Serialization of a java object en JSON format with the destination 
directory passed as parameter.

### Exercise 1:
This assessment creates a custom annotation that should allow a Java object to be serialized in a JSON file. 
The annotation must receive the directory where the resulting file will be placed.

**Compilation:**
javac -d target/classes src/main/java/nivell02/exercici01/*.java

**Execution (via Maven):**
`mvn exec:java -Dexec.mainClass="nivell02.exercice01.Main"`

**Project structure:**
```text
.
├── README.md
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── nivell01
│   │   │   │   ├── exercice01
│   │   │   │   │   ├── Main.java
│   │   │   │   │   ├── OnSiteWorker.java
│   │   │   │   │   ├── OnlineWorker.java
│   │   │   │   │   └── Worker.java
│   │   │   │   └── exercice02
│   │   │   │       ├── Main.java
│   │   │   │       ├── OnSiteWorker.java
│   │   │   │       ├── OnlineWorker.java
│   │   │   │       └── Worker.java
│   │   │   └── nivell02
│   │   │       └── exercice01
│   │   │           ├── Main.java
│   │   │           ├── SerializationToJSON.java
│   │   │           └── User.java
│   │   └── resources
│   │       └── user.json
│   └── test
│       └── java
│           └── nivell02
│               └── exercice01
│                   └── SerializationTest.java
├── target
│   ├── classes
│   │   ├── nivell01
│   │   │   ├── exercice01
│   │   │   │   ├── Main.class
│   │   │   │   ├── OnSiteWorker.class
│   │   │   │   ├── OnlineWorker.class
│   │   │   │   └── Worker.class
│   │   │   └── exercice02
│   │   │       ├── Main.class
│   │   │       ├── OnSiteWorker.class
│   │   │       ├── OnlineWorker.class
│   │   │       └── Worker.class
│   │   ├── nivell02
│   │   │   └── exercice01
│   │   │       ├── Main.class
│   │   │       ├── SerializationToJSON.class
│   │   │       └── User.class
│   │   └── user.json
│   ├── generated-sources
│   │   └── annotations
│   ├── generated-test-sources
│   │   └── test-annotations
│   └── test-classes
│       └── nivell02
│           └── exercice01
│               └── SerializationTest.class
└── user.json

