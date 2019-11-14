package SwitchStatement;

import java.util.Random;

public class SwitchStatement {

    public static void main(String[] args) {

        int dayOfWeek = 0;

        switch (dayOfWeek) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wensday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            default:
                System.out.println("week end");
                break; // optionnal
        }

        Random random = new Random();
        int c = random.nextInt(26) + 'a';// adding offset to produce lower case letters
        System.out.println((char) c + ", " + c + ": ");

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':

                System.out.println("voyelle");
                break;
            default:
                System.out.println("consone");
        }

        int x = 4;
        switch (x) {
            case 4:
//            case x:    // no compilation ce n'est pas une constante
            case 'K':    // ok car promu en int
//            case "K":  // no compilation ici c'est une String et elle ne sont pas supportée par les switch


        }
    }
}
