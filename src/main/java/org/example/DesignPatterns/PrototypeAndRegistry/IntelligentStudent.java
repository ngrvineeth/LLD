package org.example.DesignPatterns.PrototypeAndRegistry;

public class IntelligentStudent extends Student{
    float iq;
    int psp;

    public IntelligentStudent(String name, int age, float iq, int psp) {
        super(name, age);
        this.iq = iq;
        this.psp = psp;
    }
    // copy constructor
    public IntelligentStudent(IntelligentStudent sb){
        super(sb);
        this.iq = sb.iq;
        this.psp = sb.psp;
    }

    public IntelligentStudent clone(){
        System.out.println("IntelligentStudent clone");
        return new IntelligentStudent(this).clone();
    }
}
