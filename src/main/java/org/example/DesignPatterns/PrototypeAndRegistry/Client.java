package org.example.DesignPatterns.PrototypeAndRegistry;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        //Student s= new Student("Ngr", 26);
        //IntelligentStudent sb = new IntelligentStudent("Ngr", 26, 108f, 90);

        //ProtoType<Student> ps= s.clone();
        //IntelligentStudent psb =  sb.clone();

        StudentRegistry registry = StudentRegistry.getInstance();
        StudentRegistry registry2 = StudentRegistry.getInstance();

        Student scopy = registry.get("Student");
        Student iscopy = registry.get("IntelliStudent");

        System.out.println("DEBUG");
    }
}
