package oop;

public class Car {
    public String color;
    public String name;
    public int speed;

    //Constructor
    public Car(String color, String name, int speed){
        this.color = color;
        this.name = name;
        this.speed = speed;
    }
    public void descriptionOfCar(){
        System.out.println("The name of my car is " + name + " its color is " + color + " and it goes " + speed + " per hour");
    }

    public static void main(String[] args) {
        Car mustang = new Car("red", "mustang", 60);
        Car audi = new Car("blue", "audi",80);
        mustang.descriptionOfCar();
        audi.descriptionOfCar();
    }

}
