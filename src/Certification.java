import java.time.*;
import java.util.Date;

public class Certification {
    String title;
    String by;
    boolean paid;
    LocalDate start_date = LocalDate.of(0, 0, 0);
    LocalDate end_date = LocalDate.of(0, 0, 0);
    boolean complete;

    public Certification(String certificationName, String certificationAuthority, Date certificationDate) {
    }

    public Certification() {

    }

    public Certification(String certificationName, String certificationAuthority, String certificationDate) {
    }
}
