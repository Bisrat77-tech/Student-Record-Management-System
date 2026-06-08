# 👨‍🎓 Student Record Management System 👩‍🎓

## 🎯 Overview
A Java-based student management system that demonstrates three different file I/O approaches:
- **Text Files** (Scanner/PrintWriter) - Human-readable CSV format
- **Binary Files** (DataInputStream/DataOutputStream) - Compact binary format
- **Object Serialization** (ObjectInputStream/ObjectOutputStream) - Full object persistence
---
## Features
- ✅ Add new students (with duplicate ID checking)
- ✅ Search students by ID
- ✅ Update student information
- ✅ Delete students
- ✅ Display all students
- ✅ Generate statistical reports (total, highest/lowest/average GPA, department breakdown)
- ✅ Backup system using buffered streams (with performance demonstration)
- ✅ File properties display using File class
- ✅ Switch between storage types at runtime
---
## 🗃 Project Structure
```
StudentRecordSystem/
├── src/
│ ├── Student.java # Model class (implements Serializable)
│ ├── TextFileManager.java # Text I/O using Scanner/PrintWriter
│ ├── BinaryFileManager.java # Binary I/O using Data streams
│ ├── SerializationFileManager.java # Object I/O using Object streams
│ ├── StudentManager.java # CRUD operations + storage abstraction
│ ├── ReportGenerator.java # Statistics generation
│ ├── BackupService.java # Buffered stream backup
│ └── Main.java # Menu-driven interface
├── data/
│ ├── students.txt # Text storage (CSV format)
│ ├── students.dat # Binary storage
│ └── students.ser # Serialization storage
├── backup/ # Backup files directory
└── README.md
```
---
## 🖥 Storage Methods Explained

### 1. Text Files (students.txt)
- **Classes used:** `FileWriter`, `PrintWriter`, `Scanner`
- **Format:** CSV (Comma Separated Values)
- **Example:** `S001,John Doe,CS,3.8`
- **Pros:** Human-readable, can edit in any text editor
- **Cons:** Slower, manual parsing needed
---
### 2. Binary Files (students.dat)
- **Classes used:** `DataOutputStream`, `DataInputStream`
- **Format:** Raw bytes with type information
- **Order matters:** Write and read must be in same sequence
- **Pros:** Compact, faster, preserves data types
- **Cons:** Not human-readable
---
### 3. Serialization (students.ser)
- **Classes used:** `ObjectOutputStream`, `ObjectInputStream`
- **Requirement:** Class must implement `Serializable`
- **Pros:** Simplest code, saves entire objects
- **Cons:** Version sensitivity, larger files
---
## Buffered Stream Backup
The backup system demonstrates the performance benefit of buffered I/O:
- **Without buffer:** Reads/writes 1 byte at a time (slow)
- **With buffer:** Reads/writes 8KB chunks (fast)
---
## How to Run
1. Compile all Java files:
   ```bash
   javac *.java
2. Run the program:
   ``` bash
   java Main
---

## Sample Data (students.txt format)   
```
S001,Alice Johnson,CS,3.8
S002,Bob Smith,IT,3.5
S003,Carol Davis,CS,3.9
S004,David Wilson,SE,3.2
S005,Emma Brown,IT,3.7
```
---
## Exception Handling
```
FileNotFoundException → Create file if missing

IOException → Display error and recover

ClassNotFoundException → Handle serialization version issues

NumberFormatException → Validate user input

EOFException → Handle corrupted binary files
```
---
## Requirements Met

```
Requirement	                               Implementation

Student class with ID, Name, Dept, GPA	      Student.java
Add/Search/Update/Delete/Display	      StudentManager.java
Text files (Scanner/PrintWriter)	      TextFileManager.java
Binary files (Data streams)	              BinaryFileManager.java
Object Serialization	                      SerializationFileManager.java
Report (Total, Highest, Lowest, Average)      ReportGenerator.java
File class properties	                      displayFileProperties() methods
Buffered backup	                              BackupService.java
Exception handling	                      Try-catch blocks throughout

```
---
## 🧑‍💻 Author 
```
Name - Bisrat Zenebe 

ID - BITS/UGR/0022/26

Section - 1

Student Record Management System - Java File I/O Assignment
Submission Date: June 18, 2026

```

---

## How to Compile and Run

```bash
# Create directory structure
mkdir src data backup

# Put all Java files in src folder, or compile from current directory

# Compile
javac *.java

# Run
java Main
```
---
## Sample First Run
```
1. When you run the program for the first time, it will:

2. Create the data/ directory

3. Create students.txt, students.dat, and students.serStart with empty student list

4. Default storage is TEXT files
```
---

