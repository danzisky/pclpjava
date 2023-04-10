import java.text.DecimalFormat;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {

        Scanner nr = new Scanner(System.in);

        System.out.println("Please enetr a number:");

        float number = nr.nextFloat();

        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.println(number + " squared is " + decimal.format(number * number));
        System.out.println(number + " to its third power is " + decimal.format(number * number * number));
        System.out.println(number + " to its fourth power is " + decimal.format(number * number * number * number));

    }
}
