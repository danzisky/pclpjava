import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        String comp = str1.equals(str2) ? "true" : "false";
        System.out.print("Comparing "+ str1 +" and " + str2 + ": " + comp);
    }
}
