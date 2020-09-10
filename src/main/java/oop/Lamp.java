package oop;

public class Lamp {
    public boolean on;
    public boolean off;

    public void turnOn(){
        this.on= true;
        this.off = false;
        System.out.println(on);
    }
    public void turnOff(){
        this.on= false;
        this.off = true;
        System.out.println(off);
    }


    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        lamp.turnOn();
        lamp.turnOff();

    }
}
