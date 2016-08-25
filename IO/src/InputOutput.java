import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Hieu It on 8/14/2016.
 */
public class InputOutput {
    public static void main(String[] args) {
        File file = new File("HelloWorld.txt");
        try {
            PrintWriter output = new PrintWriter(file);
            output.println("Hiếu");
            output.println(97);
            output.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            int age = input.nextInt();
            System.out.println("\tName : "+name + "\n\tAge : "+age);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
