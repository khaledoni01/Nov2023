package day5;

public class MethodExamples {

    String a = "Bye";


    // non-return type method
    // non-parameterized method
//    public void sumOf_TwoValues() {
//        System.out.println( 10 + 20 );
//    }

//    return type method
//    public double sumOf_TwoValues() {
//        double val1 = 10.0;
//        int val2 = 20;
//
//        return val1 + val2;
//    }

    //    return type method
    // parameterized method
//    public double sumOf_TwoAccountBalance(int checkingAccountBalance, int savingsAccountBalance) {
//
//        return checkingAccountBalance + savingsAccountBalance;
//    }

    // parameterized method
    // non-return type
    public void sumOf_TwoAccountBalance(int checkingAccountBalance, int savingsAccountBalance) {

        System.out.println( "$" + (checkingAccountBalance + savingsAccountBalance) );
    }



    public static void main(String[] args) {

        MethodExamples me = new MethodExamples();

        me.sumOf_TwoAccountBalance(462, 101);

//        System.out.println( me.sumOf_TwoAccountBalance(462, 101) );



    }

}
