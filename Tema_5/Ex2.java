import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scannerX = new Scanner(System.in);

        System.out.println("Please enter a sentence: ");
        String userString = scannerX.nextLine();
        if(userString == "") {
            userString = "Write a program to find out the largest and smallest word in the string";
            System.out.println("Default string: Write a program to find out the largest and smallest word in the string");
        }

        String[] words = userString.split(" ");

        String smallestWord = words[0], largestWord = words[0];

        for (var i = 0; i < words.length; i++) {
            var each = words[i];
            if(each.length() > largestWord.length()) {
                largestWord = each;
            }
            if(each.length() < smallestWord.length()) {
                smallestWord = each;
            }
        }
        System.out.println("Smallest word is: "+ smallestWord);
        System.out.println("Largest word is: "+ largestWord);
        scannerX.close();
    }
}
