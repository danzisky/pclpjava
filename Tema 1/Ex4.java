import java.util.Scanner;
import java.lang.Math;
public class Ex4 {
    public static void main(String[] args) {

        Scanner nr = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int n1 = nr.nextInt();

        System.out.println("Please enter the second number");
        int n2 = nr.nextInt();

        int sum, dif, prod, avg, dis;

        sum = n1 + n2;
        dif = n1 - n2;
        prod = n1 * n2;
        avg = sum / 2;
        dis = (int) Math.sqrt(dif * dif);

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + dif);
        System.out.println("The product is: " + prod);
        System.out.println("The average is: " + avg);
        System.out.println("The distance between the points is : " + dis);
        System.out.println("The maximum number is: " + Math.max(n1, n2));
        System.out.println("The minimum number is is: " + Math.min(n1, n2));

    }
}
