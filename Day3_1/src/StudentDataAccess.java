import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hieu It on 8/22/2016.
 */
public class StudentDataAccess {
    public static void writeToBinaryFile(List<Student> studentList) throws IOException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("BinaryFile.txt"));
        objectOutputStream.writeObject(studentList);
        objectOutputStream.close();
    }

    public static List<Student> readFromBinaryFile(String path) throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        List<Student> student = (List<Student>) objectInputStream.readObject();
        objectInputStream.close();
        return student;
    }

    public static void writeToTextFile(List<Student> studentList) throws IOException {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("StudentList.txt"));) {
            for (int i = 0; i < studentList.size(); i++) {
                bufferedWriter.write(studentList.toString());
            }
        }
    }

    public static List<Student> readFromTextFile(String path) throws IOException {

        List<Student> students = new ArrayList<>();
        BufferedReader inputStream = new BufferedReader(new FileReader(path));
        String line;

        while ((line = inputStream.readLine()) != null) {
            String splitted[] = line.split(";");
            String name = splitted[0];
            String date = splitted[1];
            String address = splitted[2];
            String id = splitted[3];
            Student student = new Student(name, date, address, id);
            students.add(student);
        }
        inputStream.close();
        return students;
    }
}
