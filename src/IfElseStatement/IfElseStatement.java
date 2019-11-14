package IfElseStatement;

public class IfElseStatement {

    public static void main(String[] args) {

        boolean b = true;

        if (b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (!b) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

        int x = 1;
//        if (x){}   // no compilation x is not a boolean
//        if (x=1){} // no compilation --> this a assignement not e boolean operation

        if (x==1) {
        }            // ok

        int testScore = 76;
        char grade;

        if (testScore >= 90) {
            grade = 'A';
        } else if (testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else if (testScore >= 60) {
            grade = 'D';
        } else if (testScore >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("grade = " + grade);

        int hourOfDay = 10;
        if (hourOfDay < 11) System.out.println("Morning");       // compilation
        else if (hourOfDay > 17) System.out.println("Evening");  // compilation
        else                                                      // compilation
            System.out.println("Day" +                           // compilation
                    "day");

        if (hourOfDay < 17) {
            System.out.println("Afternoon");
        } else if (hourOfDay < 11) {
            System.out.println("Morning"); // ce code ne sera jamais executé 11 < 17
        } else {
            System.out.println("evening");
        }
    }
}
