Fighter Jet Fleet Management System with DSA Integration


A console-based Java application for managing a fleet of fighter jets using OOP principles, extended with Insertion Sort and Binary Search for DSA coursework at SZABIST University.

Features
Core OOP Functionality
Add Jet: Interactive input for Jet Name, Country, Company, Type (Bomber/Stealth/Multirole/Air Superiority), Generation

Delete Jet: Remove by exact name match

Display Fleet: Shows all jets with full attributes

File Operations: Create/delete files, save/load fleet as structured text

DSA Enhancements
Insertion Sort (Option 9): Sorts fleet by Jet Name length (ascending) - O(n²) in-place algorithm

Binary Search (Option 10): Fast lookup by exact Jet Name on sorted fleet - O(log n) efficiency

Demo Flow

1. Add jets: "Su-57", "F-22", "Rafale" → Displays in insertion order
2. Option 9 → Sorts by name length: F-22(4) → Rafale(6) → Su-57(5)
3. Option 10 → Search "F-22" → Returns full jet details instantly

   Tech Stack
Language: Java 11+

Data Structures: ArrayList<Jet>, Iterator for safe deletion

OOP: Encapsulation (Jet class), Single Responsibility (separate FileOps, JetInput)

File I/O: BufferedReader/Writer for persistent storage

IDE: IntelliJ IDEA recommended

Project Structure

fleetmanagement/
├── Main.java              # Menu-driven application
├── Jet.java              # Model class with getters/setters
├── Fleet.java            # Core collection operations
├── JetInput.java         # Validated console input
├── FileOps.java          # File CRUD operations
├── InsertionSort.java    # DSA: Length-based sorting
└── BinarySearch.java     # DSA: Exact name search

Prerequisites
Java 11+ installed

IDE (IntelliJ IDEA / Eclipse) or command line: javac *.java && java Main

Quick Start
Clone/download all .java files to one folder

Compile: javac fleetmanagement/*.java

Run: java fleetmanagement.Main

Use menu 1-10

Sample Output

=== Fighter Jet Fleet Management ===
9. Sort Jets (Insertion Sort by Name Length)
10. Search Jet (Binary Search by Name)

Jet Name: F-22, Country: USA, Company: Lockheed...
Jet Name: Rafale, Country: France, Company: Dassault...

Academic Context
Course: Object-Oriented Programming → Data Structures & Algorithms

OOP Goals: Classes, encapsulation, file persistence, console UI

DSA Goals: Insertion Sort (simple comparison), Binary Search (prerequisite: sorted data)

University: SZABIST Karachi, BS Software Engineering (Semester 2 → DSA)

Limitations & Extensions
Current: Sorts by name length (instructor-friendly), exact search

Future: Lexicographic sort (compareToIgnoreCase), partial name search, GUI

Author
Adan Shujaat Khan
Wajahat Hassan
BS Software Engineering Students
SZABIST University Karachi
