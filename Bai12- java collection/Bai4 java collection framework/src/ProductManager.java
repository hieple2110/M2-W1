import java.util.*;

public class ProductManager {
    public static final String PRODUCT_ALREADY_EXISTS = "Product already exists.";
    public static final String LINES = "=========";
    public static final String PRODUCT_DOES_EXISTS = "Product does exists.";
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> list = new ArrayList<>();
    public static int index;

    public static void main(String[] args) {
        menu();
        while (true) {
            String number = sc.nextLine();
            switch (number) {
                case "1":
                    addProduct();
                    break;
                case "2":
                    editProductWithId();
                    break;
                case "3":
                    deleteProductWithId();
                    break;
                case "4":
                    showProduct();
                    break;
                case "5":
                    searchProductWithId();
                    break;
                case "6":
                    sortProductWithPrice();
                    break;
                case "0":
                    System.out.println("Thanks for you choice !!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Press the menu button to continue.");
            }
        }
    }

    public static void addProduct() {
        Product product = new Product();
        System.out.println("Enter name of product:");
        product.setName(sc.nextLine());
        System.out.println("Enter id of product:");
        product.setId(sc.nextInt());
        System.out.println("Enter price of product:");
        product.setPrice(sc.nextDouble());
        if (isProduct(product.getId())) {
            System.out.println("Product already add.");
            list.add(product);
        } else {
            System.out.println(PRODUCT_ALREADY_EXISTS);
        }
        System.out.println(LINES);
    }

    public static void editProductWithId() {
        System.out.println("Enter id of product to be edited:");
        int numberId = sc.nextInt();
        if (isID(numberId)) {
            System.out.println("Enter name of product to be edited:");
            list.get(index).setName(sc.next());
            System.out.println("Enter id of product to be edited:");
            list.get(index).setId(sc.nextInt());
            System.out.println("Enter id of product to be edited:");
            list.get(index).setPrice(sc.nextDouble());
        } else {
            System.out.println(PRODUCT_DOES_EXISTS);
        }
        System.out.println(LINES);
    }

    public static void deleteProductWithId() {
        System.out.println("Enter id of product to be deleted:");
        int numberId = sc.nextInt();
        if (isID(numberId)) {
//            list.remove(index);
            list.remove(list.get(index));
//            for (Product product1 : list) {
//                System.out.println(product1.toString());
//            }
            System.out.println("product has been deleted");
        } else {
            System.out.println(PRODUCT_DOES_EXISTS);
        }
        System.out.println(LINES);
    }

    public static void showProduct() {
        for (Product product : list) {
            System.out.println(product.toString());
        }
        System.out.println(LINES);
    }

    public static void searchProductWithId() {
        System.out.println("Enter id of product in find:");
        int numberId = sc.nextInt();
        if (isID(numberId)) {
//            System.out.println("Are looking for product...");
//            System.out.println("=========");
            System.out.println(list.get(index).toString());
//            for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i));
//            }
        } else {
            System.out.println(PRODUCT_DOES_EXISTS);
            System.out.println(LINES);
        }
    }

    public static void sortProductWithPrice() {
//       dung cho compartor..
        Test test = new Test();
        Collections.sort(list, test);
//        Collections.sort(list);
//        dung cho comparable...
        for (Product sort : list) {
            System.out.println(sort.toString());
        }
        System.out.println(LINES);
    }

    public static boolean isProduct(int id) {
        for (Product product : list) {
            if (id == (product.getId())) {
                return false;
            }
        }
        return true;
    }

    public static boolean isID(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (id == (list.get(i).getId())) {
                index = i;
                return true;
            }
        }
        return false;
    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1: Add Product");
        System.out.println("2: Edit Product");
        System.out.println("3: Delete Product");
        System.out.println("4: Show Product");
        System.out.println("5: Search Product");
        System.out.println("6: Sort Product");
        System.out.println("0: Exit");
        System.out.println("Please select the function performed");
    }
}
