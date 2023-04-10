import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {

        Scanner nr = new Scanner(System.in);

        System.out.println("Please enter any integer:");

        int number = nr.nextInt();
        int digit;

        do {

            digit = number % 10;
            number = number / 10;
            System.out.println(digit);

        } while (number != 0);
    }
}
