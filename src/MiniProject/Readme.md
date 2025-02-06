# **Internal Student Management System**  

This is a **Java-based Command-Line Interface (CLI) application** designed to efficiently manage student records with **automatic data persistence** in a structured **JSON** format. The system allows users to perform **CRUD operations**, including adding, updating, searching, deleting, filtering, and sorting student records.  

---

### **Key Features:**  
- **Student Management Operations**: Efficiently add, view, update, delete, and search student records.  
- **JSON-based Data Persistence**: Automatically saves and retrieves student data in a structured **JSON** format.  
- **Sorting and Filtering**: Sort students by **name** or **age** and filter by **grade**.  
- **Exception Handling & Input Validation**: Prevents errors by validating inputs and handling exceptions gracefully.  
- **User-friendly CLI Interface**: Interactive **menu-driven system** for ease of use.  

---

## **Technologies Used:**  
- **Java 8+**: Utilizes **Streams, Lambda Expressions, and Functional Interfaces** for data processing.  
- **Jackson Library**: Handles **JSON parsing** and serialization.  
- **Collections API**: Uses **ArrayList and HashMap** for efficient storage.  

---

## **Project Structure:**  
The project consists of the following components:  
- **InternalStudentManagementSystem**: Main entry point with the **CLI interface**.  
- **Student**: Model class encapsulating attributes like **ID, Name, Age, Grade, and Email**.  
- **DataHandler**: Core class containing the CRUD operations, sorting, filtering, and data persistence (JSON handling).  
- **students.json**: File that stores student records persistently in JSON format.  

---

## **Features in Detail:**  

- **Add a New Student**: Allows the user to enter new student details, including ID, name, age, grade, and email.  
- **View All Students**: Displays all student records sorted by their unique IDs.  
- **Search by ID or Name**: Provides options to search for students based on ID or name.  
- **Update Student**: Allows the user to update student details, including name, age, grade, and email.  
- **Delete Student**: Removes a student record based on the student ID.  
- **Filter Students by Grade**: Filters and displays students based on their grade.  
- **Sort Students by Name or Age**: Provides sorting options to view students either by their names or ages.  
- **Undo Last Operation**: Allows the user to undo the last modification (add, update, delete) made to the student records.  
- **JSON Persistence**: Ensures all student records are saved to and retrieved from a JSON file.  

---

## **How to Run:**  

### **Prerequisites:**  
- **Java 8+** must be installed.  
- The **Jackson Databind Library** must be included in the project for JSON handling.  
  - You can add Jackson via **Maven** or **Gradle**, or manually include the JAR files in your project.  

### **Execution:**  
1. **Clone the repository** or **download the project files**.  
2. **Compile the Java files**:  
   - Run:  
     ```sh
     javac InternalStudentManagementSystem.java DataHandler.java Student.java
     ```  
3. **Run the program**:  
   - Execute:  
     ```sh
     java InternalStudentManagementSystem
     ```  
4. The **menu-driven interface** will appear. You can select operations by entering the corresponding **number (1-9)**.  

---

### **Operations:**  
- The program will prompt you to input student details for creating and updating records.  
- You will be able to filter, sort, and view student records based on various criteria.  
- All changes to student data will be saved automatically in **students.json**.  

---
