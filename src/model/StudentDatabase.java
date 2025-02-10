package model;

import java.util.HashMap;
import java.util.Map;

public class StudentDatabase {
    private static StudentDatabase instance;
    private Map<Integer, Student> students;

    private StudentDatabase() {
        students = new HashMap<>();
        students.put(101, new Student(101, "Alice", 89.5)); // Preloaded data
    }

    public static StudentDatabase getInstance() {
        if (instance == null) {
            instance = new StudentDatabase();
        }
        return instance;
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }
}