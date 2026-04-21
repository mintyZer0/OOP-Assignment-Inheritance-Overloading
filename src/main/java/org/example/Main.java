package org.example;

class Employee {
    protected int id; protected String name; protected int age; protected String address; protected int salary;

    public Employee(int id, String name, int age, String address, int salary) {
        setInfo(id, name, age, address, salary);
    }

    public int getId() { return id; } public void setID(int id) { this.id = id; }
    public String getName() { return name; } public void setName(String name) { this.name = name; }
    public int getAge() { return age; } public void setAge(int age) { this.age = age; }
    public String getAddress() { return address; } public void setAddress(String address) { this.address = address; }
    public int getSalary() { return salary; } public void setSalary(int salary) { this.salary = salary; }

    public void setInfo(int id, String name, int age, String address, int salary) {
        setID(id); setName(name); setAge(age); setAddress(address); setSalary(salary);
    }
    public void setInfo(int id, String name, int age, String address) {
        setID(id); setName(name); setAge(age); setAddress(address);
    }
}

class Dean extends Employee {
    private String faculty;

    public Dean(int id, String name, int age, String address, int salary, String faculty) {
        super(id, name, age, address, salary); setFaculty(faculty);
    }

    public String getFaculty() { return faculty; }
    public void setFaculty(String faculty) { this.faculty = faculty; }

    public void scheduleFacultyMeeting(String date, String agenda) {
        System.out.println("Dean scheduled meeting: " + date + " - " + agenda);
    }

    public void setInfo(int id, String name, int age, String address, int salary, String faculty) {
        super.setInfo(id, name, age, address, salary); setFaculty(faculty);
    }
    public void setInfo(String newFaculty, int newSalary) {
        setFaculty(newFaculty);
        setSalary(newSalary);
    }
}

class Chairperson extends Employee {
    private String department;

    public Chairperson(int id, String name, int age, String address, int salary, String dept) {
        super(id, name, age, address, salary); setDepartment(dept);
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public void assignCourse(String facultyName, String courseCode) {
        System.out.println(facultyName + " assigned to " + courseCode);
    }

    public void setInfo(int id, String name, int age, String address, String dept) {
        super.setInfo(id, name, age, address); setDepartment(dept);
    }
    public void setInfo(String newDept, int newSalary) {
        setDepartment(newDept);
        setSalary(newSalary);
    }
}

class Clerk extends Employee {
    private String officeLocation;

    public Clerk(int id, String name, int age, String address, int salary, String office) {
        super(id, name, age, address, salary); setOfficeLocation(office);
    }

    public String getOfficeLocation() { return officeLocation; }
    public void setOfficeLocation(String officeLocation) { this.officeLocation = officeLocation; }

    public void processEnrollment(String studentId, String course) {
        System.out.println("Processed enrollment: " + studentId + " -> " + course);
    }

    public void setInfo(int id, String name, int age, String address, String office) {
        super.setInfo(id, name, age, address); setOfficeLocation(office);
    }
    public void setInfo(String newOffice, String newHomeAddress) {
        setOfficeLocation(newOffice);
        setAddress(newHomeAddress);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(10, "Mark", 30, "Manila", 25000);
        Dean dean = new Dean(1, "Robert", 40, "Tarlac", 50000, "CCS");
        Chairperson chair = new Chairperson(2, "John", 45, "Pampanga", 45000, "IT");
        Clerk clerk = new Clerk(3, "Maria", 25, "Bataan", 20000, "Admin");

        emp.setInfo(10, "Mark Ramos", 30, "Manila", 25000);
        emp.setInfo(10, "Mark Ramos", 31, "Manila");

        dean.setInfo(21, "Roberta", 41, "Tarlac", 60000, "COE");
        dean.setInfo("Education", 65000);

        chair.setInfo(2, "John Diver", 46, "Bulacan", "CS");
        chair.setInfo("Engineering", 55000);

        clerk.setInfo(3, "Maria Clairo", 26, "Bataan", "Main Building");
        clerk.setInfo("Registrar Office", "Subic Bay");

        dean.scheduleFacultyMeeting("Oct 25", "Curriculum Update");
        chair.assignCourse("Prof. D", "CS101");
        clerk.processEnrollment("2023-0001", "IT202");
    }
}