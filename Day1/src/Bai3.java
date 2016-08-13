import java.util.Scanner;

/**
 * Created by Hieu It on 8/12/2016.
 */
public class Bai3 {
    public static void main(String[] args) {
        char[] arr;
        String terms1 = "", terms2 = "";
        int index = 0;
        double result = 0;
        Scanner input = new Scanner(System.in);
        String calculation = input.nextLine();
        arr = calculation.toCharArray();
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '+' || arr[i] == '-' || arr[i] == 'x' || arr[i] == ':') {
                    index = i;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (calculation.charAt(i) != ' ') {
                    if (i < index) {
                        terms1 += calculation.charAt(i);
                    }
                    if (i > index) {
                        terms2 += calculation.charAt(i);
                    }
                }
            }
            if (arr[index] == '+') {
                result = Double.valueOf(terms1) + Double.valueOf(terms2);
            }
            if (arr[index] == '-') {
                result = Double.valueOf(terms1) - Double.valueOf(terms2);
            }
            if (arr[index] == 'x') {
                result = Double.valueOf(terms1) * Double.valueOf(terms2);
            }
            if (arr[index] == ':') {
                result = Double.valueOf(terms1) / Double.valueOf(terms2);
            }
            System.out.println("Kết quả :" + result);
        } catch (NumberFormatException ex) {
            System.out.println("Bạn nhập sai toán hạng !");
            System.out.println("Erorr : " + ex.getMessage());
        }
        if (arr[index] != '+' && arr[index] != '-' && arr[index] != 'x' && arr[index] != ':') {
            System.out.println("Bạn nhập sai toán tử !");
        }
    }
}
