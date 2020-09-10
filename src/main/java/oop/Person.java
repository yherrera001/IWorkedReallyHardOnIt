package oop;

public class Person {
    //Properties / attributes / instance variables
    public int head;
    public String name;

    //Default Constructor
    public Person(int head, String name){
        //Paramaterized constructor
this.head = head;
this.name = name;
    }

    //Methods
    public void walk(){
        System.out.println("walking..");
    }
}
