import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        System.out.println("nhập đường dẫn file:");
        Scanner scanner = new Scanner(System.in);
        String path =scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }

    public void readFileText(String filePath){
        try{
            File file =new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader buf = new BufferedReader(new FileReader(file));

            String line;
            int sum = 0;

            while ((line = buf.readLine()) !=null){
                System.out.println(line);
                sum +=Integer.parseInt(line);
            }
            buf.close();

            System.out.println(sum);
        }  catch (Exception e) {
            System.out.println("file không tồn tại");
        }
    }
}
