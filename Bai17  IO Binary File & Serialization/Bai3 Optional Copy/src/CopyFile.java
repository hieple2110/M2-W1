import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter source file: ");
        String sourceIn = scanner.nextLine();
        System.out.print("Enter dest file: ");
        String destOut = scanner.nextLine();

        File fileIn = new File(sourceIn);
        File fileOut = new File(destOut);

        try {
            copyFileByte(fileIn, fileOut);
            System.out.println("copy file successful");
        } catch (IOException e) {
            System.out.println("can not copy that file.");
        }
    }


    public static void copyFileByte(File source, File dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        int count = 0;

        try {
            in = new FileInputStream(source);
            out = new FileOutputStream(dest);
            byte[] buff = new byte[1024];
            int line;
            while ((line = in.read(buff)) > 0) {
                out.write(buff, 0, line);
                count+= line;
            }
            System.out.println("copy file successful");
            System.out.println(Arrays.toString(buff));
            System.out.println(count);
        } finally {
            in.close();
            out.close();
        }
    }
}
