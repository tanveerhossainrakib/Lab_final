package Main;
import adapter.ExternalStudentAPI;
import adapter.StudentAdapter;
import controller.StudentController;
import model.Student;
import model.StudentDatabase;
import view.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        StudentController controller = new StudentController(view);

        // Fetch student from Singleton Database
        System.out.println("Fetching student from the Singleton database...");
        controller.displayStudent(101);

        // Fetch student from External API via Adapter
        System.out.println("Fetching student from External API via Adapter...");
        ExternalStudentAPI api = new ExternalStudentAPI();
        Student adaptedStudent = StudentAdapter.convert(api.getStudentData());

        // Add external student to the database and display
        StudentDatabase.getInstance().addStudent(adaptedStudent);
        controller.displayStudent(202);
    }
}