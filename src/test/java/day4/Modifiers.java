package day4;

public class Modifiers {



    static String st = "Static";

    final String FN = "Final";


    public static void main(String[] args) {

        System.out.println( Modifiers.st );

        Modifiers mod = new Modifiers();

        System.out.println( mod.FN );



        //        System.out.println("Assignment Operators");
//
//        // user details
//        int age = 18;
//        age = age % 2;
////        age %= 1;
////        age++;
//
//        System.out.println( age ); // 19


//        System.out.println( age > 18 || age == 18 ); // false or true = true
//
//        System.out.println( age >= 18 ); //true

//        String country = "UK";

//        System.out.println( (age > 12) && (country == "USA") ); // true && false = false
//
//        System.out.println( (age > 12) || (country == "USA") ); // true or false = true

//        System.out.println( 1 > 2 ); // false
//        System.out.println( 1 < 2); // true
//        System.out.println( 1 == 2); // false
//        System.out.println( 1 != 2 ); // true

//        System.out.println("Arithmetic Operators");
//        System.out.println( 1 + 2 ); // 3
//        System.out.println( 1 - 1 ); // 0
//        System.out.println( 2 * 3 ); // 6
//        System.out.println( 5 / 2 ); // 2
//        System.out.println( 5.0 / 2 ); // 2.5
//        System.out.println( 11 % 3 ); // 2
//        System.out.println( 15 % 4 ); // 3  modulus



    }

}
