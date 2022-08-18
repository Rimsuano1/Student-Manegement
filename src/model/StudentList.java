package model;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    List<Student> studentList=new ArrayList<>();
    public int add(Student student) {
        studentList.add(student);
        return 1;
    }
    public List<Student> getStudentList() { return studentList; }
}
