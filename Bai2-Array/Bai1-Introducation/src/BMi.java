import java.util.Scanner;

public class BMi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height;
        System.out.println("Enter weight: ");
        weight = sc.nextDouble();
        System.out.println("Enter height: ");
        height = sc.nextDouble();

        double bmi = weight/Math.pow(height,2);
        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if(bmi >= 18.5 && bmi <25.0){
            System.out.printf("Normal");
        }else if(bmi >=  25.0 && bmi <30){
            System.out.println("Overweight");
        }else if(bmi >= 30){
            System.out.println("Obese");
        }
    }
}
