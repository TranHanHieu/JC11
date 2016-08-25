import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hieu It on 8/22/2016.
 */
public class StudentDataAccess {
    public static void writeToBinaryFile(List<Student> studentList) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\BinaryFile.txt"));
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
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\StudentList.txt"));
        for (int i = 0; i < studentList.size(); i++) {
            bufferedWriter.write(studentList.toString());
            bufferedWriter.write("\r\n");
        }
        bufferedWriter.close();
    }

    public static List<Student> readFromTextFile(String path) throws IOException {
        List<Student> students = new ArrayList<>();
        BufferedReader inputStream = new BufferedReader(new FileReader(path));
        String line, name = " ", date = " ", address = " ", Id = " ";
        while ((line = inputStream.readLine()) != null) {
            try {
                String splitted[] = line.split(";");
                name = splitted[0];
                date = splitted[1];
                address = splitted[2];
                Id = splitted[3];
                Student student = new Student(name, date, address, Id);
                students.add(student);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return students;
    }

}
