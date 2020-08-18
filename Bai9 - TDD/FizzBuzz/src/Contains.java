import java.util.Scanner;

public class Contains {
    public static String Contain(String number) {
//        if (number.equals("3")) return "Fizz";
//        if (number.contains("5")) return "Buzz";
        String result ="";
        switch (number) {
            case "0" :
                result ="k";
                break;
            case "1":
                result ="mot";
                break;
            case "2":
                result ="hai";
                break;
            case "3":
                result ="Fizz";
                break;
            case "4":
                result ="bon";
                break;
            case "5":
                result ="Buzz";
                break;
            case "6":
                result ="sau";
                break;
            case "7":
                result ="bay";
                break;
            case "8":
                result ="tam";
                break;
            case "9":
                result ="chin";
                break;
        }
        return result;
    }
}