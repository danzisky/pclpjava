import java.util.Scanner;

public class Passwords {
    String password;
    String Message;

    public String setPassword(String password) {
        this.password = password;
        if(isValid()) {
            this.Message = "Password created successfully without any errors";
        }
        return this.Message;
    }
    public boolean isValid() {
        if(this.password.length() < 8) {
            this.Message = "Error: Password must be at least 8 characters long";
            return false;
        }
        if(this.password.contains(" ")) {
            this.Message = "Error: Password contains invalid characters or white space";
            return false;
        }
        if(!beginsWithUppercase()) {
            this.Message = "Error: Password does not begin with an upper case character";
            return false;
        }
        if(!containsSpecialCharacter()) {
            this.Message = "Error: Password does not contain special characters";
            return false;
        }
        return true;
    }

    public boolean containsSpecialCharacter() {
        String specialCharactersString = "#S%!@^&*";
        String[] specialCharacters = specialCharactersString.split("");
        boolean containsSpecialChar = false;
        for (int i = 0; i < specialCharacters.length; i++) {
            if(this.password.contains(specialCharacters[i])) {
                containsSpecialChar = true;
            }
        }
        return containsSpecialChar;
    }

    public boolean beginsWithUppercase() {
        return Character.isUpperCase(this.password.codePointAt(0));
    }

    /* public static void main(String[] args) {
        String password;
        Passwords userPassword = new Passwords();
        Scanner scannerX = new Scanner(System.in);

        System.out.println("Please Enter a Password: ");
        password = scannerX.nextLine();

        userPassword.setPassword(password);

        System.out.println(userPassword.Message);
    } */
}
