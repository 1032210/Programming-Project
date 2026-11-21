/*
 * Name:        ProfessionalService.java
 * Description: Child class of Business. Adds specialty and service-only methods.
 * Created by:  Hamna
 * Last edited: 11-20-2026
 */

/**
 * A professional services business
 * It is a Business and has a name, a city and employees. It also
 * has a specialty.
 *
 * @Hamna
 */
public class ProfessionalService extends Business {

    // an extra attribute ONLY for this child class
    private String specialty;

    /**
     * Creates a professional service with the specialty "General".
     * A number of employees below 1 is ignored.
     *
     * @param name the name of the business
     * @param city the city the business is in
     * @param employees the number of people who work there
     */
    public ProfessionalService(String name, String city, int employees) {
        super(name, city, employees);
        specialty = "General";
    }

    /**
     * Returns this business's specialty.
     *
     * @return the specialty
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * Changes this business's specialty. A null or empty specialty is ignored.
     *
     * @param specialty the new specialty
     */
    public void setSpecialty(String specialty) {
        if (specialty != null && !specialty.isEmpty()) {
            this.specialty = specialty;
        }
    }

    /**
     * Returns what kind of business this is.
     *
     * @return "Professional Service"
     */
    @Override
    public String getType() {
        return "Professional Service";
    }

    /**
     * Returns a label for how big this business is.
     *
     * @return "Solo practice" for 1 employee, otherwise "Firm"
     */
    @Override
    public String getSizeLabel() {
        if (getEmployees() == 1) {
            return "Solo practice";
        } else {
            return "Firm";
        }
    }

    /**
     * Returns which size bracket this business is in, where each bracket
     * is 10 employees wide.
     *
     * @return 0 for 1 to 9 employees, 1 for 10 to 19, and so on
     */
    public int getSizeBracket() {
        return getEmployees() / 10;
    }
}