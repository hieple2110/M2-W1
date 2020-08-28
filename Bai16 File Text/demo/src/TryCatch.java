import java.io.*;

public class TryCatch {
    public static void main(String[] args) throws IOException {


        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("moto.jpg");
            outputStream = new FileOutputStream("C:\\Users\\HP\\Desktop\\xe\\moto.jpg");

            byte[] buff = new byte[inputStream.available()];
            while ((inputStream.read(buff)) > 0) {
                outputStream.write(buff);

            }
            System.out.print("File is copied successful: ");

        } catch (IOException e) {
            e.fillInStackTrace();
        } finally {
            inputStream.close();
            outputStream.close();
        }


    }
}
