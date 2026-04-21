# Java OOP Demonstration: Inheritance and Method Overloading

This repository contains a simple Java application that demonstrates core Object-Oriented Programming (OOP) concepts, specifically **Inheritance**, **Encapsulation**, and **Method Overloading**. 

## 📝 Project Requirements

This project was built to satisfy the following requirements:

### 1. Base Class: `Employee`
- Contains protected data fields: `id`, `name`, `age`, `address`, and `salary`.
- Provides appropriate getter and setter methods for each field.
- Implements method overloading by creating multiple versions of `setInfo` with different parameter lists.

### 2. Subclasses: `Dean`, `Chairperson`, `Clerk`
- Inherit from the base `Employee` class.
- Each subclass defines its own role-specific methods:
  - `Dean`: `scheduleFacultyMeeting()`
  - `Chairperson`: `assignCourse()`
  - `Clerk`: `processEnrollment()`
- Each subclass includes at least one meaningful overloaded method (e.g., handling batch updates like promotions or relocations).

### 3. Main Application
- Creates an instantiated object for each class.
- Demonstrates the use of overloaded methods in both the base class and each subclass.

---
# Instructions
# Object-Oriented Programming: Inheritance and Method Overloading

Create a Java program that demonstrates the core concepts of object-oriented programming, specifically inheritance and method overloading.

## Base Class
Create a class named Employee with the following data fields:
* id
* name
* age
* address
* salary

Provide appropriate getter and setter methods for each field.
Implement method overloading by creating multiple versions of a method (e.g., setInfo) with different parameter lists.

## Subclasses
Create three subclasses that inherit from Employee:
* Dean
* Chairperson
* Clerk

Each subclass must:
* Define its own role-specific methods.
* Include at least one overloaded method.

## Main Application
Write a Java application that:
* Creates an object for each class (Employee, Dean, Chairperson, Clerk).
* Demonstrates the use of overloaded methods in both the base class and each subclass.

## Submission Requirements
The final output must be handwritten on bond paper and include:
* A UML Class Diagram
* The complete Java source code
