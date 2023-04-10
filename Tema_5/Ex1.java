import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String password;
        Passwords userPassword = new Passwords();
        Scanner scannerX = new Scanner(System.in);

        System.out.println("Please Enter a Password: ");
        password = scannerX.nextLine();
        
        String response = userPassword.setPassword(password);
        System.out.println(response);
    }
}