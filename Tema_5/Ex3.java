import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams");
        } else {
            System.out.println("The two strings are not anagrams");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {       
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);
        
        return Arrays.equals(str1Arr, str2Arr);
    }
}
