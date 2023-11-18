package day10;

public class Poly {

// method overloading
    public void testMethod() {
        System.out.println("Test method one");
    }

    public void testMethod(String value) {
        System.out.println("Test method two: " + value);
    }

    public void testMethod(int value) {
        System.out.println("Test method three: " + value);
    }


    public static void main(String[] args) {

        Poly p = new Poly();

        p.testMethod(200);

    }

}
