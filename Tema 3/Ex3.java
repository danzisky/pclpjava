import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {

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

        ArrayList<Integer> newArrList = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int j;

        for (j = 0; j < n; j++) {
            if (!set.contains(arrList[j])) {
                set.add(arrList[j]);
                newArrList.add(arrList[j]);
            }
        }

        for (j = 0; i < newArrList.size(); i++) {
            System.out.print(newArrList.get(i) + " ");
        }

    }

}