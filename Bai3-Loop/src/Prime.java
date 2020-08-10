
public class Prime {
    public static void main(String[] args) {
        int number =2;
        int count = 1;
        while (count < 21) {
            boolean b = true;
            if (number < 2) {
                b=false;
            } else {
                int i = 2;
                while (i <= Math.sqrt(number)) {
                    if (number % i == 0) {
                        b = false;
                        break;
                    }
                    i++;
                }
                if (b) {
                    System.out.println(number + " is a prime " +count);
                    count++;
                }
            }
            number++;
        }
    }
}
