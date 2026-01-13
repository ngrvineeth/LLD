package org.example.DesignPatterns.PrototypeAndRegistry;

public class Student implements ProtoType<Student>{
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    public Student clone(){
        System.out.println("Student clone");
        return new Student(this).clone();
    }
}
