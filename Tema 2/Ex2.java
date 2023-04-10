import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        System.out.println("----CALENDAR----");

        Scanner date = new Scanner(System.in);

        System.out.print("Please enter a calendar day (1-31) : ");
        int day = date.nextInt();
        while (day > 31 || day < 1) {

            System.out.println("ERROR!");
            System.out.print("Please enter a calendar day (1-31) : ");
            day = date.nextInt();
        }

        System.out.print("Please enter a calendar month (1-12) : ");
        int month = date.nextInt();
        while (month > 12 || day < 1) {

            System.out.println("ERROR!");
            System.out.print("Please enter a calendar month (1-12) : ");
            month = date.nextInt();
        }

        System.out.print("Please enter a calendar year : ");
        int year = date.nextInt();
        while (year < 1) {
            System.out.print("ERROR! : ");
            System.out.print("Please enter a calendar year : ");
            year = date.nextInt();
        }

        System.out.println("The date entered is : " + day + "." + month + "." + year);

        if (month == 1) {
            month = 13;
        }

        if (month == 1) {
            month = 13;
        }

        int h;
        h = ((day + ((13 * (month + 1)) / 5) + year % 100 + (year % 100) / 4 + (year / 100) / 4 - 2 * (year / 100)) % 7);

        String[] days = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

        System.out.println(days[h]);

    }

}