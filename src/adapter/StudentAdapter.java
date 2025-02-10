package adapter;

import model.Student;

public class StudentAdapter {
    public static Student convert(String externalData) {
        String[] data = externalData.split(",");
        int id = Integer.parseInt(data[0]);
        String name = data[1];
        double grade = Double.parseDouble(data[2]);
        return new Student(id, name, grade);
    }
}