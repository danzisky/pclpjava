import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {

        Scanner nr = new Scanner(System.in);

        System.out.println("Plpease enter a number between 0 and 1000");

        int number = nr.nextInt();
        int digit, newNumber = 0;
        int n = 0;

        if (0 <= number && number <= 1000) {

            do {

                digit = number % 10;
                newNumber = newNumber + digit;
                number = number / 10;

            } while (number != 0);

            System.out.println(newNumber);
        }

    }

}
