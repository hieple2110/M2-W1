//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class MySerializable {
//    public static void main(String[] args) throws Exception {
//MySerializable mySerializable =new MySerializable();
//mySerializable.serialization();
//        mySerializable.deserialization();
//
//    }
//
//    List<Product> productList = new ArrayList<>();
//    public void serialization() throws IOException {
//        Product product1 = new Product("1", "Hao Hao", "Viet Nam", "5000");
//        Product product2 = new Product("2", "Hao Hao", "Viet Nam", "5000");
//        Product product3 = new Product("3", "Hao Hao", "Viet Nam", "5000");
//        Product product4 = new Product("4", "Hao Hao", "Viet Nam", "5000");
//        Product product5 = new Product("5", "Hao Hao", "Viet Nam", "5000");
//        Product product6 = new Product("6", "Hao Hao", "Viet Nam", "5000");
//        Product product7 = new Product("7", "Hao Hao", "Viet Nam", "5000");
//        Product product8 = new Product("8", "Hao Hao", "Viet Nam", "5000");
//        Product product9 = new Product("9", "Hao Hao", "Viet Nam", "5000");
//
//
//
//        productList.add(product1);
//        productList.add(product2);
//        productList.add(product3);
//        productList.add(product4);
//        productList.add(product5);
//        productList.add(product6);
//        productList.add(product7);
//        productList.add(product8);
//        productList.add(product9);
//
//        FileOutputStream fout = new FileOutputStream("source.txt");
//        ObjectOutputStream out = new ObjectOutputStream(fout);
//        for (Product product :productList) {
//            out.writeObject(product);
//        }
//
//        out.flush();
//        out.close();
//        System.out.println("dau vao");
//    }
//
//    public void deserialization() throws Exception {
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream("source.txt"));
//        for(int i = 0; i<productList.size();i++){
//            Product product = (Product) in.readObject();
//            System.out.println(product.code+ " " + product.name+" "+ product.manufacture+" "+ product.price);
//        }
//
//
//        in.close();
//        System.out.println("doc ra");
//    }
//}