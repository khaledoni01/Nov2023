package day11;

import day11.Vehicle;

public class Car extends Vehicle {

    public void wheels() {
        System.out.println("4 wheels");
    }

    public void demo() {
        System.out.println("demo");
    }

    public static void main(String[] args) {


        Car c = new Car();

        c.wheels();

        c.demo();

    }


}
