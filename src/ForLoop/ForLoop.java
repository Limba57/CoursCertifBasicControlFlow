package ForLoop;

public class ForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.print("i : ");
            }
            System.out.print(i + " ");
        }
        // i is only available in the loop

        System.out.println();

        int a;
        for (a = 0; a < 10; a++) {
            if (a == 0) {
                System.out.print("a : ");
            }
            System.out.print(a + " ");
        }
        System.out.println();
        // a declaration is out of the loop so a is available outside
        System.out.println("after loop a = " + a);

//        // compile --> infinite for loop
//        for (;;) {
//            System.out.println("hell0");
//
//        }

        int x = 0;
        for (int y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.println("y = " + y);
            //1 y=0 x=0 --> print y=0 --> y++ x++
            //2 y=1 x=1 --> print y=1 --> y++ x++
            //3 y=2 x=2 --> print y=2 --> y++ x++
            //4 y=3 x=3 --> print y=3 --> y++ x++
            //5 y=4 x=4 --> print y=4 --> y++ x++
            //6 y=5 x=5 --> out of the loop
            // print x=5

        }
        System.out.println("x = " + x);

        int d = 10;
        // no compilation: in the for declaration we initialize d again
        // with int e = 0, d = 0 ...
        // this line is equalto
        // int e = 0 ;
        // int d = 0 ; --> the probleme is here: we have a second déclaration of d
//        for (int e = 0, d = 0; e < 10 || d < 10; e++, d++) {
//
//        }

        // no compilation: it's impossible to declare different type in the first for statement
//        for (long z =0, int e = 5; ...) {
//        }

        for (long z = 0; z < 10; z++) {
        }  // compilation ok
        for (double z = 0; z < 10; z--) {

        } // compilation ok
    }
}
