package day8;

import java.util.Arrays;

public class DayEight {
//1.
//    i. Write a method which takes one String argument
//    ii. Given values will printed as uppercased
//    Ex: upperCaseMethod(“hello”); // HELLO
//2.
//    i. Write a method which takes an array of int
//    ii. Array can contain 3 values
//    iii. Add all the values
//    iv. Return the total.
//            Note: Use a loop to do it
//    Ex: arrayTotal({1, 2, 3}) // 6


    public int arrayTotal(int[] values) {

        int total = 0;

        for (int v : values) {
            total = total + v;
            //total = 0 + 10 = 10
            //total = 10 + 20 = 30
            //total = 30 + 30 = 60
        }

        return total;
    }

    public static void main(String[] args) {

        DayEight de = new DayEight();

        int[] arr = {10, 20, 30};
        System.out.println( de.arrayTotal(arr) );



////        String bd = "bd";
////        String uk = "uk";
////        String usa = "usa";
//
//        // Array of String values
//        String[] countries = {"BD", "UK", "USA", "RA", "BR"};
//
////        countries[0];
////        countries[1];
////        countries[2];
//
////        for(int index = 0; index < countries.length; index++) {
////
////            System.out.println( countries[index] );
////        }
//
//        // Enhanced For..Loop
//        for (String country : countries) {
//
//            System.out.println(country);
//        }



    }
}
