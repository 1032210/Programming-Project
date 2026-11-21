/*
 * Name:        ConvenienceStore.java
 * Description: Child class of Business. Adds openLate and store-only methods.
 * Created by:  Hamna
 * Last edited: 11-20-2026
 */

/**
 * A convenience store. It is a Business and has a name, a city and
 * employees, and whether or not it's open late.
 *
 * @Hamna
 */
public class ConvenienceStore extends Business {

    // an extra attribute ONLY for this child class
    private boolean openLate;

    /**
     * Creates a convenience store that is not open late.
     * A number of employees below 1 is ignored.
     *
     * @param name the name of the store
     * @param city the city the store is in
     * @param employees the number of people who work there
     */
    public ConvenienceStore(String name, String city, int employees) {
        super(name, city, employees);
        openLate = false;
    }

    // /**
     * Checks whether this store is open late.
     *
     * @return true if the store is open late, false otherwise
     */
    public boolean isOpenLate() {
        return openLate;
    }

    // /**
     * Changes whether this store is open late.
     *
     * @param openLate true if the store is open late
     */
    public void setOpenLate(boolean openLate) {
        this.openLate = openLate;
    }

/**
     * Returns what kind of business this is.
     *
     * @return "Convenience Store"
     */
    @Override
    public String getType() {
        return "Convenience Store";
    }

/**
     * Returns a label for how big this store is.
     *
     * @return "Corner store" for 3 or fewer employees, otherwise "Busy store"
     */
    @Override
    public String getSizeLabel() {
        if (getEmployees() <= 3) {
            return "Corner store";
        } else {
            return "Busy store";
        }
    }

    /**
     * Returns how many full shifts of 3 people this store can staff.
     *
     * @return the number of full shifts
     */
    public int getFullShifts() {
        return getEmployees() / 3;   // integer division
    }

    /**
     * Returns how many employees are left over after the full shifts.
     *
     * @return the number of extra employees, from 0 to 2
     */
    public int getExtraStaff() {
        return getEmployees() % 3;
    }
}