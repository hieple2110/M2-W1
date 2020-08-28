import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source file: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter dest file:");
        String destPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingStream(sourceFile,destFile);
            System.out.println("copy completed");
        } catch (IOException e) {
                System.out.println("can not copy that file.");
        }
    }

    public static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(source);
            out = new FileOutputStream(dest);
            int length;
            byte[] buf = new byte[1024];
            while ((length = in.read(buf)) > 0) {
                out.write(buf, 0, length);
            }
        } finally {
            in.close();
            out.close();
        }
    }
}
