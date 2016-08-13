import java.util.Scanner;

/**
 * Created by Hieu It on 8/13/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập lần lượt 3 cạnh của tam giác");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        try {
            Triangle triangle = new Triangle(side1, side2, side3);
        } catch (IllegalArgumentException ex) {
            System.out.println("Độ dài 3 cạnh không thoả mãn");
        }

    }
}
