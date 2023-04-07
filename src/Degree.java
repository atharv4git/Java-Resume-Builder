import java.time.*;
public class Degree {
    String clg_name;
    String course_name;
    String major;
    String dept;
    LocalDate start_date = LocalDate.of(0, 0, 0);
    LocalDate end_date = LocalDate.of(0, 0, 0);
    float cgpa;
    boolean backlog;
    boolean complete;

    public Degree(String degreeName, String major, double gpa) {
    }

    public Degree() {

    }

    public Degree(String degreeName, String major, String gpa) {
    }
}
