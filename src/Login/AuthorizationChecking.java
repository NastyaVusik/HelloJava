package Login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class AuthorizationChecking {

    //Origin login and password
//    static String loginOrigin = "NastyaVusik";
//    static String passwordOrigin = "Halera123!$";

//    //Entered password and login
//    static String passwordInput;
//    static String loginInput;


    //Method for checking entering password
//    public static void checkPassword(String passwordInput) throws WrongPasswordException {
//        if (!(passwordInput.equals(passwordOrigin))) {
//            throw new WrongPasswordException("This password doesn't match with origin password");
//        }
//        if (passwordInput.contains(" ")) {
//            throw new WrongPasswordException("A password can't contain symbol of whitespace");
//        }
//
//        if (passwordInput.length() >= 20) {
//            throw new WrongPasswordException("This password is longer then 19 symbols");
//        }
//
//        if (checkDigitInPassword(passwordInput)) {
//            throw new WrongPasswordException("This password have to contain at least one digit");
//        }
//
//      else {
//            System.out.println("Your password is correct\n");
//        }
//
//    }


    //Method for checking entering login
    static void checkLogin(String loginOrigin) throws WrongLoginException {

        //Create scanner to enter a login
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a login: ");
        String loginInput = scan.next();

        if (!(loginInput.equalsIgnoreCase(loginOrigin))) {
            throw new WrongLoginException("This login doesn't match with origin login");
        } else {
            System.out.println("Your login is correct\n");
        }
    }


    //Method for checking entering password
    static void checkPassword(String passwordOrigin) throws WrongPasswordException {

        //Create scanner to enter a password
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String passwordInput = scan.next();

        scan.close();

        if (checkDigitInPassword(passwordInput)) {
            throw new WrongPasswordException("This password have to contain at least one digit");
        }

        if (checkPasswordLength(passwordInput)) {
            throw new WrongPasswordException("This password is longer then 19 symbols");
        }

        if (checkWhitespace(passwordInput)) {
            throw new WrongPasswordException("A password can't contain symbol of whitespace");
        }

        if (!(passwordInput.equals(passwordOrigin))) {
            throw new WrongPasswordException("This password doesn't match with origin password");
        } else {
            System.out.println("Your password is correct\n");
        }

    }


    //Method for checking, if a password contains at least one digit
    //Create pattern and matcher objects to check, if a passwordInput contain at least one digit
    static boolean checkDigitInPassword(String passwordInput) {
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(passwordInput);
        while (matcher.find(pattern.flags())) {
            return false;
        }
        return true;
    }


    //Method for checking whitespace in entering password
    static boolean checkWhitespace(String passwordInput) {
        if (!(passwordInput.contains(" "))) {
            return false;
        }
        return true;
    }


    //Method for checking length in entering password
    static boolean checkPasswordLength(String passwordInput) {
        if (passwordInput.length() < 20) {
            return false;
        }
        return true;
    }

}
