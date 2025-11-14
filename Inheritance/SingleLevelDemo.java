package Inheritance;
//This program demonstrates single-level inheritance where Student inherits properties from UniversityMember
//and displays the details.


class UniversityMember {
    String name;
    String id;

    UniversityMember(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

class Student extends UniversityMember {
    String course;
    double marks;

    Student(String name, String id, String course, double marks) {
        super(name, id);
        this.course = course;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
    }
}

public class SingleLevelDemo {
    public static void main(String[] args) {
        Student s = new Student("Arun", "U102", "AI & ML", 87.5);
        s.display();
    }
}
