package day9;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsFramework {

//    i. Create a HashMap with 2 values
//    ii. Loop through the HashMap to print values only using keys
//    Note: Don’t use values() method


    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        map.put(1, 100);
        map.put(2, 200);

        for (int m : map.keySet()) {

            System.out.println( map.get(m) );
        }

    }


}
