import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner nr = new Scanner(System.in);

        System.out.println("Please enter a number:");

        float number = nr.nextFloat();

        if (number > 0)
            System.out.println("The number is positive!");
        else
            System.out.println("The number is not positive!");

    }
}