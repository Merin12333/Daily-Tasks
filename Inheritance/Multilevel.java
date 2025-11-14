package Inheritance;
//This program demonstrates multilevel inheritance where SeniorDeveloper inherits from Developer, 
//which in turn inherits from Employee and are displayed through showProfile().

class Employee {
    String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int empId, String programmingLanguage) {
        super(name, empId);
        this.programmingLanguage = programmingLanguage;
    }
}

class SeniorDeveloper extends Developer {
    int experience;
    double salary;

    SeniorDeveloper(String name, int empId, String programmingLanguage, int experience, double salary) {
        super(name, empId, programmingLanguage);
        this.experience = experience;
        this.salary = salary;
    }

    void showProfile() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Language: " + programmingLanguage);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Salary: " + salary);
    }
}

public class Multilevel{
    public static void main(String[] args) {
        SeniorDeveloper sd = new SeniorDeveloper("Rithik", 2201, "Java", 6, 85000);
        sd.showProfile();
    }
}
