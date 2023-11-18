package day11;

import java.util.ArrayList;

public class Goat implements Animal, Add {

    public void sound() {
        System.out.println("Wee wee");
    }
    public void name() {
        System.out.println("goat");
    }
    public void legs() {
        System.out.println("4 legs");
    }
    public void additional() {
        System.out.println("additional");
    }

    public static void main(String[] args) {

        Goat g = new Goat();

        g.sound();
        g.legs();
        g.name();

        g.additional();
    }


}
