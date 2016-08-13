import java.util.Scanner;

/**
 * Created by Hieu It on 8/12/2016.
 */
public class Bai2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Nhập vị trí cần thêm giá trị : ");
                int index = input.nextInt();
                System.out.println("Nhập giá trị tại vị trí " + index + " :");
                int value = input.nextInt();
                array[index] = value;
                break;
            }
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Vị trí không tồn tại !");
        }
    }
}
