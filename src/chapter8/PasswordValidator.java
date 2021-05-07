package chapter8;

import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        // require entry data: user, old password, new password
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter user");
        String user = scanner.next();
        System.out.println("Enter your password");
        String password = scanner.next();
        System.out.println("Enter your new password, it must have at least one capital letter, a symbol and not be the same either the user or current password");
        String newPassword = scanner.next();

        boolean isValid = validatePassword(user, password, newPassword);
        while (!isValid){
            System.out.println("Invalid password");
            System.out.println("Enter your new password, it must have at least one capital letter, a symbol and not be the same either the user or current password");
            newPassword = scanner.next();
            isValid = validatePassword(user, password, newPassword);
        }
            System.out.println("Your changes has been saved successfully");


    }

    /**
     * Validate the if the new pass has the following requirements
     * -at least 8 characters long
     * -contain an uppercase letter
     * -contain a special character
     * -not contain the username
     * -not the same as the old pass
     * @param user username
     * @param password current pass
     * @param newPassword new pass
     * @return if it passes will return true
     */
    private static boolean validatePassword(String user, String password, String newPassword) {

        boolean someUppercase = false;
        boolean someDigit = false;

        if (user.equals(newPassword) || password.equals(newPassword)){
            return false;
        }else {

            for ( int i=0; i < newPassword.length(); i++){

                char currentChar = newPassword.charAt(i);
                if (Character.isUpperCase(currentChar)){
                    someUppercase = true;
                }
                if (Character.isLetterOrDigit(currentChar)){
                    someDigit = true;
                }
            }
        }
        if (someUppercase && someDigit){
            return true;
        }else return false;
    }
}
