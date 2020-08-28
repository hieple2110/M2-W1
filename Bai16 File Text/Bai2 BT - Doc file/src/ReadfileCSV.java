import java.io.*;

public class ReadfileCSV {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\file\\country.csv");

        if (!file.exists()) {
            file.createNewFile();
        }

        FileInputStream fileInputStream = new FileInputStream(file);
        int c = fileInputStream.read();
        while (c!= -1){
            System.out.print((char)c);
            c= fileInputStream.read();
        }
        fileInputStream.close();


//        cach 2: dung slip

//        try {
//            File inFile = new File("D:\\file\\country.csv");
//            FileReader filereader = new FileReader(inFile);
//            BufferedReader reader = new BufferedReader(filereader);
//            String line = null;
//            while ((line = reader.readLine()) != null) {
//                String[] country = line.split(",");
//                System.out.println("Country code: " + country[4] + " name: " + country[5]);
//            }
//            reader.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
