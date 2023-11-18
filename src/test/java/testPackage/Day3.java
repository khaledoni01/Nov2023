package testPackage;

public class Day3 {
    int a = 20; // class variable and class level

    String username; // instance/object variable and class level

    // Constructor
    public Day3(String name) { //name = kz01
        username = name; // kz01
    }

    public static void main(String[] args) {

        Day3 d2 = new Day3("kz02");
        Day3 d3 = new Day3("kz03");

        System.out.println(d2.username);
        System.out.println(d3.username);
    }

}
