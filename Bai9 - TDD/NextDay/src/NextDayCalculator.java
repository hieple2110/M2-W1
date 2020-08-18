import java.util.Scanner;

public class NextDayCalculator {

    public static String NextDayCalculator1(int day, int month, int year) {

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day < 31) {
                    day += 1;
                } else {
                    day = 1;
                    month++;
                }
                break;
            case 2:
                if (day <= 28) {
                    day += 1;
                    break;
                }
                if (day == 29) {
                    day = 1;
                    month++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 30) {
                    day += 1;
                } else {
                    day = 1;
                    month++;
                }
                break;
            case 12:
                if (day < 31) {
                    day += 1;
                    break;
                }
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year++;
                }
                break;
        }
        return day + "/" + month + "/" + year;
    }
}


