import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();
        System.out.print("Enter the replacing word: ");
        String replacingWord = scanner.nextLine();

        String newSentence = sentence.replaceAll(wordToReplace, replacingWord);

        System.out.print("Ypur new sentence is: " + newSentence);
    }
}
