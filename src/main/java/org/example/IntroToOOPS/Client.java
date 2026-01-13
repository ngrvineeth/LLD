package org.example.IntroToOOPS;

public class Client {
    public static void main(String args[]){
        Student s = new Student();
        s.setAge(25);
        s.getAge();
        s.gradYear=2017;
        //s.giveRating(5);
        //s.solveAssignment(450);
        //System.out.println(s.age);
        //System.out.println(s.gradYear);
        BankAccount b=new BankAccount();
        b.setBalance(202.0);
        System.out.println(b.getBalance());
        b.setOwnerName("sai");
        b.getOwnerName();

    }
}
