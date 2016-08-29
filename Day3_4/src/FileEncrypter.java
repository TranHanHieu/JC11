import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hieu It on 8/25/2016.
 */
public class FileEncrypter {
    public static void fileEncrypter(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws IOException {
        int bytes ;
        List<Byte> list = new ArrayList<>();
        while ((bytes=fileInputStream.read()) != -1){
            list.add((byte) bytes);
        }
        for (int i = 0; i < list.size(); i++) {
            fileOutputStream.write((list.get(i)+5));
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pathInput = "";
        System.out.println("Input File : ");
        pathInput = input.next();
        System.out.println("Output File : ");
        String pathOutput = input.next();
        try {
            FileInputStream fileInputStream = new FileInputStream(pathInput);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(pathOutput));
            fileEncrypter(fileInputStream, fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
