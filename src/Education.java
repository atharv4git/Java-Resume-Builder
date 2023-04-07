public class Education {
    String name = ContactInfo.name;
    Degree degree = new Degree();
    Certification certification  = new Certification();

    public Education(String schoolName, Degree degree, Certification certification) {
    }

    public int toCsvString() {
        return 0;
    }
}