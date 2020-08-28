import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Manager {
    public static Scanner sc = new Scanner(System.in);
    public static File file = new File("source.txt");
    public static int code;

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1: Add Product");
        System.out.println("2: Show Product");
        System.out.println("3: Search Product");
        System.out.println("0: Exit");
        System.out.println("Please select the function performed");
    }

    public static void addProduct() {
        Product product = new Product();
        System.out.println("Enter name of product:");
        product.setName(sc.nextLine());
        System.out.println("Enter manufacture of product:");
        product.setManufacture(sc.nextLine());
        System.out.println("Enter price of product:");
        product.setPrice(sc.nextLine());
        try {
            String test = product.toString();
            FileReader fileReader = new FileReader(file);
            BufferedReader buff = new BufferedReader(fileReader);
            String temp ="";
            String line;
            while ((line = buff.readLine()) != null) {
                temp += line + "\n";
            }
            FileWriter fileWriter = new FileWriter(file);
            if (temp == null) {
                fileWriter.write(test);
            } else {
                temp += test;
                fileWriter.write(temp);
            }
            buff.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void showProduct() throws IOException {
        try {
            FileReader fileReader = new FileReader("source.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }


    public static void searchProduct() throws IOException {
        try {
            System.out.println("Enter name of product in find:");
            String name = sc.nextLine();
            FileReader fileReader = new FileReader(file);
            BufferedReader buff = new BufferedReader(fileReader);
            String line = "";
            while ((line = buff.readLine()) != null) {
                boolean check = false;
                String[] list = line.split(",");
                for (int i = 0; i < list.length; i++) {
                    if (name.equals(list[i])) {
                        System.out.println(list[i]);
                        check = true;
                    }
                }
                if (check) {
                    System.out.println(Arrays.toString(list));
                }
            }
            buff.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}