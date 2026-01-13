package org.example.IntroToOOPS;

public class Student {
    int id;
    int gradYear;
    private int age;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void solveAssignment(int assignmentId){
        System.out.println("Assignment solve"+assignmentId);
    }
    public void giveRating(int rating){
        System.out.println("rating is"+rating);
    }
}
