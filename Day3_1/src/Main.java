import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hieu It on 8/23/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        Student student = new Student();
        List<Student> students = new ArrayList<>();
        System.out.println("Nhập tên : ");
        student.setName(input.nextLine());
        System.out.println("Nhập NS :");
        student.setBirthDay(input.nextLine());
        System.out.println("Nhập đ/c : ");
        student.setAddressStudent(input.nextLine());
        System.out.println("Nhập MSV : ");
        student.setStudentId(input.nextLine());
        studentManager.addStudent(student);
        students.add(student);
        System.out.println(students);
        StudentDataAccess.writeToBinaryFile(students);
        StudentDataAccess.writeToTextFile(students);
        System.out.println(StudentDataAccess.readFromTextFile("E:\\StudentList.txt"));
        System.out.println(StudentDataAccess.readFromBinaryFile("E:\\BinaryFile4.txt"));

    }
}
