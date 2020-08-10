public class HundredPrime {
    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
            boolean b = true;
                int i = 2;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        b = false;
                        break;
                    }
                    i++;
                }
                if (b) {
                    System.out.println(number + " is a prime ");
                }
            number++;
            }
        }
    }


