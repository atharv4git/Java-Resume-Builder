import java.time.LocalDate;

public class WorkExperience {
    String type_of_company;
    String name_of_company;
    String role;
    LocalDate start_date = LocalDate.of(0, 0, 0);
    LocalDate end_date = LocalDate.of(0, 0, 0);
    boolean currently_working_here;
    String summary;

    public WorkExperience(String companyName, String location, String startDate, String endDate, String description) {
    }
}
