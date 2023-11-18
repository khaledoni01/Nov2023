package day5;

public class Exercises {
//    1. Create a method with one argument/parameter which will print “Hello
//    World” in the console
//    Ex: printHello(“Hello World”);
    public void printHello(String value){
        System.out.println(value);
    }

//    2.
//    i) Create a method which will return sum/total of two given number
//    ii) Print in the console

    public int total() {
        return 10 + 10;
    }

//    i) Create a method which will return an int
//    ii) Add 10 to it and print in the console.

    public int thirdExample() {
        return 20;
    }

    public static void main(String[] args) {

        Exercises e = new Exercises();

        double v = e.thirdExample() + 10.0; // 20 + 10.0 == 30.0

        System.out.println( v );

    }
}
