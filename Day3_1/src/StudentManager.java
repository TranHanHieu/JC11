import java.util.ArrayList;

/**
 * Created by Hieu It on 8/22/2016.
 */
public class StudentManager {
    ArrayList<Student> studentArrayList = new ArrayList<>();

    public void addStudent(Student student) {
        studentArrayList.add(student);
    }

    public void deleteStudent(String studentId) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getStudentId().equals(studentId)) {
                studentArrayList.remove(i);
            }
        }
    }

    public Student findStudentId(String studentId) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getStudentId().equals(studentId)) {
                return studentArrayList.get(i);
            }
        }
        return null;
    }

    public void editNameStudent(String oldName, String newName) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getName().equals(oldName)) {
                studentArrayList.get(i).setName(newName);
            }
        }
    }

    public void editIdStudent(String oldId, String newId) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getStudentId().equals(oldId)) {
                studentArrayList.get(i).setName(newId);
            }
        }
    }

    public void editBirthDayStudent(String oldBrithDay, String newBirthDay) {
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (studentArrayList.get(i).getBirthDay().equals(oldBrithDay)) {
                studentArrayList.get(i).setName(newBirthDay);
            }
        }
    }
}
