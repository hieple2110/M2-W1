import java.io.*;

public class CopyText {
    public static void main(String[] args) throws IOException {
        File source = new File("source");
        File target = new File("target");

        if (!source.exists()) {
            System.out.println("File does not exists");
        }
        if (target.exists()) {
            System.out.println("File already exists ");
        }

        InputStream inputStream = null;
        OutputStream outputStream = null;
        int count = 0;

        try {
            inputStream = new FileInputStream("source.txt");
            outputStream = new FileOutputStream("target.txt");
            int length;
            byte[] buff = new byte[inputStream.available()];
            while ((length = inputStream.read(buff)) > 0) {
                outputStream.write(buff, 0, length);
                count += length;
            }
            System.out.print("File is copied successful: ");
            System.out.println(count + " characters");
        } catch (IOException e) {
            e.fillInStackTrace();
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}