package testPackage;

public class ExamOne {
//    1. Write a program which initialize an instance variable and prints whichever
//    name is provided while creating the object.
//            Ex: Hello

    String word;

    public ExamOne(String value) {
        word = value;
    }

    public static void main(String[] args) {

        ExamOne eOne = new ExamOne("hello");

        System.out.println( eOne.word );

    }
}
