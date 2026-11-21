// ProfessionalService is the child class for Business which is the parent class
public class ProfessionalService extends Business {
    private String specialty;   // extra attribute that only this child class has

    // constructor: super sends the shared data to the parent class Business
    public ProfessionalService(String name, String city, int employees) {
        super(name, city, employees);
        specialty = "General";
    }

    // getter for the extra attribute
    public String getSpecialty() {
        return specialty;
    }

    // setter: changes speciality (the extra attribute) ONLY if it is not empty
    public void setSpecialty(String specialty) {
        if (specialty != null && !specialty.isEmpty()) {
            this.specialty = specialty;
        }
    }

    @Override
    // replaces the parent version
    public String getType() {
        return "Professional Service";
    }

    @Override
    // replaces the parent version: solo practice or firm
    public String getSizeLabel() {
        if (getEmployees() == 1) {
            return "Solo practice";
        } else {
            return "Firm";
        }
    }

    // size bracket of 10 employees (19 / 10 is 1, not 2, because integer division does not round)
    public int getSizeBracket() {
        return getEmployees() / 10;
    }
}