import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        System.out.println("----VOTER ELIGIBILITY----");

        Scanner nr = new Scanner(System.in);
        System.out.println("Please enter your age:");

        int varsta = nr.nextInt();

        int remainingYears = (18 - varsta);

        String eligible = varsta > 18 ? "yes" : "no";
        switch (eligible) {

            case "yes":

                System.out.println("You are of the required age to vote!");
                break;

            default:
                System.out.println("Sorry ypu aren't yet eligible.\nDo wait for about " + remainingYears
                        + " years to join the throng");
                break;

        }
    }
}