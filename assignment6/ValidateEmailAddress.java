package assignment6;

import java.util.Scanner;

public class ValidateEmailAddress {
	public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        
        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex == 0 || atIndex == email.length() - 1) {
            return false;
        }
        
        int dotIndex = email.indexOf('.', atIndex + 1);
        if (dotIndex == -1 || dotIndex == email.length() - 1) {
            return false;
        }
        for (char c : email.toCharArray()) {
            if (!isValidCharacter(c)) {
                return false;
            }
        }
        
        return true;
    }

    private static boolean isValidCharacter(char c) {
        return (Character.isLetterOrDigit(c) || c == '.' || c == '-' || c == '_');
    }
    public static void main(String[] args) {
    	System.out.println("Validate the email Address");
    	System.out.println("**************************\n");
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter your email address:");
        String email = sc.next();
        boolean isValid = isValidEmail(email);
        if (isValid) {
            System.out.println(email + " :is a valid email address.");
        } else {
            System.out.println(email + " :is not a valid email address.");
        }
        sc.close();
    }
}