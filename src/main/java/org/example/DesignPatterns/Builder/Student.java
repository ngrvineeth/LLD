package org.example.DesignPatterns.Builder;

public class Student {
    int age;
    String name;
    float psp;

    public Student(StudentBuilder sb){
        if(sb.age<18){throw new RuntimeException("Age can't be less than 18");}
        this.age=sb.age;
        this.name=sb.name;
        this.psp=sb.psp;

    }
    static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

}
