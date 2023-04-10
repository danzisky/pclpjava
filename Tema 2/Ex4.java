import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner nr = new Scanner(System.in);

        System.out.println("Please enter a number either whole or with two digits after the comma:");

        float number = nr.nextFloat();
        int digit = 0;
        int sumEven = 0;
        int sumOdd = 0;

        number = number * 100;

        while (number != 0) {
            digit = (int) number % 10;
            number = number / 10;
            if (digit % 2 == 0) {
                sumEven = digit + sumEven;
            } else
                sumOdd = digit + sumOdd;
        }

        System.out.println("The sum of the even digits is :" + sumEven);
        System.out.println("The sum of the odd numbers is :" + sumOdd);

    }

}