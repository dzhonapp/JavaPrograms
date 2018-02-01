import java.util.Scanner;

/**
 * Created by bma on 1/29/18.
 */
public class numberConverter {

    // Program doesnt check if user entered correct data! So solve that part yourself.

// hex to decimal converter
    private static void converterHextoDec (String a){
        int decimal = Integer.parseInt(a, 16);
        System.out.println("Hex value is " + decimal);
    }

    private static void convertDectoHex (String a) {
        int no = Integer.parseInt(a); // Throws exception!
        String hex1 = Integer.toHexString(no);
        System.out.println("Hex value is " + hex1);
    }

    private static void convertOctaltoDec(String a) {
        int dec = Integer.parseInt(a, 8);
        System.out.println("Decimal value is: "  + dec);
    }

    private static void convertDectoOct(String a) {
        int b = Integer.parseInt(a);
        String octalString = Integer.toOctalString(b);
        System.out.println(" Octal value is: " + octalString);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to numbering system conversion program! ");




            System.out.println("What would you like to convert!");
            System.out.println("From Octal press 1: ");
            System.out.println("From Hexadecimal press 2: ");
            System.out.println("From Decimal press 3: ");
            String user_respond = input.nextLine();
                System.out.println("Please enter the number! ");
                String a = input.nextLine();

        switch (user_respond) {

            case "1":
                convertOctaltoDec(a);
                convertOctaltoHex(a);
                break;
            case "2":

                converterHextoDec(a);
                convertHextoOct(a);
                break;
            case "3":
                convertDectoHex(a);
                convertDectoOct(a);

            }

    }

    private static void convertHextoOct(String a) {
        // You have to finish here.
    }

    private static void convertOctaltoHex(String a) {
        int b = Integer.parseInt(a, 8);
        String hex = Integer.toHexString(b);
        System.out.println("Hex value is: " + hex);

    }


}
