import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Hieu It on 8/13/2016.
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Nhập 1 số nguyên : ");
                int number = input.nextInt();
                System.out.println("Số nguyên vừa nhập là : " + number);
                break;
            }
        } catch (InputMismatchException ex) {
            System.out.println("Chương trình yêu cầu nhập số nguyên");
        }
    }
}
