import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        int n;
        Scanner nr = new Scanner(System.in);

        System.out.println("Enter a number of elements to work with");

        n = nr.nextInt();

        int[] arrList = new int[n];
        System.out.println("Introduce values for " + n + " elements\n");

        int i;

        for (i = 0; i < n; i++)

        {

            arrList[i] = nr.nextInt();

        }

        Arrays.sort(arrList);

        int size = arrList.length;

        int secondLargest = arrList[size - 2];

        System.out.println("The second largest number is: " + secondLargest);

    }
}