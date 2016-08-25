import java.io.*;
import java.util.Scanner;

/**
 * Created by Hieu It on 8/25/2016.
 */
public class FileEncrypter {
    public static void fileEncrypter(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bytes = String.valueOf(fileInputStream.read()).getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println("byte 1 :" + bytes[i]);
            bytes[i] += 5;
            System.out.println("byte2 : " + bytes[i]);
        }
        fileOutputStream.write(bytes);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pathInput = "";
        System.out.println("Input File : ");
        pathInput = input.nextLine();
        System.out.println("Output File : ");
        String pathOutput = input.nextLine();
        try {
            FileInputStream fileInputStream = new FileInputStream(pathInput);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(pathOutput));
            fileEncrypter(fileInputStream, fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
