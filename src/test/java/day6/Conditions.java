package day6;

public class Conditions {

//2. Write a nested if where country is equal to USA, else print -> no language.
//   Nested if should have below conditions
// if state is equal to NY -> print “You’re a survivor”
//   else if state is equal to NJ -> print “You’re a peach lover”
//
    public static void main(String[] args) {

        String country = "UK";
        String state = "NY";

        if(country.equals("USA")) {

            if(state.equals("NY")) {
                System.out.println("You're a survivor");
            }
            else if(state.equals("NJ")) {
                System.out.println("You're a peach lover");
            }
        }
        else {
            System.out.println("Else block");
        }




    }

}
