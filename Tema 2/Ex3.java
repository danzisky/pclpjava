
public class Ex3 {

    public static void main(String[] args) {

        int number = 1;

        for (number = 2; number <= 100; number++)

        {

            if (number == 2 || number == 3) {

                System.out.println("Prime number :" + number);

            }

            if (number % 2 == 0 || number % 3 == 0) {

                continue;

            } else

                System.out.println("Prime number :" + number);
        }
    }
}