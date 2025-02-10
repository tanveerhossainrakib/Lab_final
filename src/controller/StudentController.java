package controller;

import model.Student;
import model.StudentDatabase;
import view.StudentView;

public class StudentController {
    private StudentView view;

    public StudentController(StudentView view) {
        this.view = view;
    }

    public void displayStudent(int id) {
        Student student = StudentDatabase.getInstance().getStudent(id);
        if (student != null) {
            view.displayStudentDetails(student);
        } else {
            System.out.println("Student not found!\n");
        }
    }

    public void updateStudentGrade(int id, double newGrade) {
        Student student = StudentDatabase.getInstance().getStudent(id);
        if (student != null) {
            student.setGrade(newGrade);
            System.out.println("Student grade updated!\n");
        } else {
            System.out.println("Student not found!\n");
        }
    }
}