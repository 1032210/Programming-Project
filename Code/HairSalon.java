/*
 * Name:        HairSalon.java
 * Description: Child class of Business. Adds chairs and salon-only methods.
 * Created by:  Hamna
 * Last edited: 11-20-2026
 */

/**
 * A hair salon. It is a Business and has a name, a city and employees, and it 
 * also has a number of chairs.
 *
 * @Hamna
 */
public class HairSalon extends Business {

    // an extra attribute ONLY for this child class
    private int chairs;

    /**
     * Creates a hair salon with one chair for each employee.
     * A number of employees below 1 is ignored.
     *
     * @param name the name of the salon
     * @param city the city the salon is in
     * @param employees the number of people who work there
     */
    public HairSalon(String name, String city, int employees) {
        // super sends the data up to the Business constructor
        super(name, city, employees);
        chairs = getEmployees();
    }

    /**
     * Returns the number of chairs in this salon.
     *
     * @return the number of chairs
     */
    public int getChairs() {
        return chairs;
    }

    /**
     * Changes the number of chairs in this salon. A number below 1 is ignored.
     *
     * @param chairs the new number of chairs
     */
    public void setChairs(int chairs) {
        if (chairs >= 1) {
            this.chairs = chairs;
        }
    }

    /**
     * Returns what kind of business this is.
     *
     * @return "Hair Salon"
     */
    @Override
    public String getType() {
        return "Hair Salon";
    }

    /**
     * Returns a label for how big this salon is.
     *
     * @return "Small salon" for fewer than 5 employees, otherwise "Large salon"
     */
    @Override
    public String getSizeLabel() {
        if (getEmployees() < 5) {
            return "Small salon";
        } else {
            return "Large salon";
        }
    }

    /**
     * Returns how many full pairs of stylists work here.
     *
     * @return the number of pairs
     */
    public int getStylistPairs() {
        return getEmployees() / 2;   // integer division
    }

    // /**
     * Returns how many stylists are left over without a partner.
     *
     * @return 1 if the number of employees is odd, otherwise 0
     */
    public int getLeftover() {
        return getEmployees() % 2;  // modulo
    }
}