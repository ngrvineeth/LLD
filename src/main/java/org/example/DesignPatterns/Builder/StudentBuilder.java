package org.example.DesignPatterns.Builder;

public class StudentBuilder {
    int age;
    String name;
    float psp;
    public StudentBuilder setAge(int age){
        this.age=age;
        return this;
    }
    public StudentBuilder setName(String name){
        this.name=name;
        return this;
    }
    public StudentBuilder setPsp(float psp){
        this.psp=psp;
        return this;
    }
    public Student build(){
        return new Student(this);
    }


}
