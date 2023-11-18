package testPackage;

public class ExamTwo {

    String greetings;
    String name;

    public ExamTwo(String g, String n) {
        greetings = g;
        name = n;
    }

    public static void main(String[] args) {

        ExamTwo eTwo = new ExamTwo("Good Morning, ", "John");

        System.out.println( eTwo.greetings + eTwo.name );

    }
}
