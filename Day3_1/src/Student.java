import com.sun.org.glassfish.gmbal.ManagedObject;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

import javax.jws.Oneway;
import java.io.Serializable;

/**
 * Created by Hieu It on 8/22/2016.
 */
public class Student implements Serializable {
    private String name;
    private String birthDay;
    private String studentId;
    private String addressStudent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getAddressStudent() {
        return addressStudent;
    }

    public void setAddressStudent(String addressStudent) {
        this.addressStudent = addressStudent;
    }

    public Student(String name, String birthDay, String addressStudent, String studentId) {
        this.name = name;
        this.birthDay = birthDay;
        this.addressStudent = addressStudent;
        this.studentId = studentId;
    }

    public Student() {
    }

    public String toString() {
        return "\t Name : " + getName() + ";\t Ngày Sinh : " + getBirthDay() + ";\t Địa chỉ : " + getAddressStudent() + ";\t MSSV : " + getStudentId()+"\t";
    }
}
