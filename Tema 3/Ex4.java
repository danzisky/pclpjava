import java.util.Random;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Random r = new Random();

        Scanner nr = new Scanner(System.in);

        System.out.println("Enter the size of the matrix, n * n\nn:");

        int n;
        n = nr.nextInt();

        int[][] matrice = new int[n][n];

        int i, j, val;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                val = r.nextInt(20);
                matrice[i][j] = val;
                System.out.println("Mat["+i+"]["+j+"]: "+val);
            }
        }

        int sum = 0;
        int b = 0;
        j = 0;

        while (j < n && i < n) {
            j = j + 1;
            i = i + 1;
            sum += matrice[i][j];
            b += j;
            System.out.println(b);
        }

        System.out.println(b);

    }
}
