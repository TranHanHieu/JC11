import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hieu It on 8/25/2016.
 */
public class FileDecrypter {
    public static void fileDecrypter(FileInputStream fileInputStream, FileOutputStream fileOutputStream) throws IOException {
        int bytes ;
        List<Byte> list = new ArrayList<>();
        byte[] bytes1 =new byte[1024];
        while ((bytes=fileInputStream.read()) != -1){
            list.add((byte) bytes);
        }
        for (int i = 0; i < list.size(); i++) {
            fileOutputStream.write((list.get(i)-5));
        }
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
            fileDecrypter(fileInputStream, fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
