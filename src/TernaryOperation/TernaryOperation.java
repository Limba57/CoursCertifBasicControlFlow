package TernaryOperation;

public class TernaryOperation {

    public static void main(String[] args) {

        int x = 10;
        int y;

        if (x > 5) {
            y = 2 * x;
        } else {
            y = 4 * x;
        }
        System.out.println("y = " + y);

        // ternary operator
        y = (x > 5) ? (2 * x) : (4 * x);
        System.out.println("y = " + y);

        // not same data type assignement
        System.out.println(y > 5 ? 10 : "test"); // ok because no assignation
//        int myInt = y < 10 ? 5 : "Test"; // no compilation --> myInt cannot be a String

        int a = 1;
        int b = 1;
        int c = a < 10 ? a++ : b++;
        // c = a = 1
        // a = 2
        // b ne change pas car son traitement n'est pas executé
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        int d = 1;
        int e = 2;
        int f = 3;
        if (d < 10) {
            f = d++ < 1 ? e++ : f++;
        } else {
            f = (d + e) < 2 ? d++ : e++;
        }
        // d est inf à 10 donc
        // f = d++ < 1 ? e++ : f++
        // d est sup à 1 donc f++ et d++
        // d=2 e=2 f=3
        System.out.println("d = " + d + ", e = " + e + ", f =" + f);

    }
}
