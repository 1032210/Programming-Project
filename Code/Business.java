/*
 * Name: Business.java
 * Description: This program tracks the respective names, cities, 
 and number of employees for many different businesses across Ontario.
 * Created by: Hamna
 * Last edited: 11-20-2026
 */

/**
 * A business in Ontario. Every business has a name, a city, and a number of
 * employees. HairSalon, ConvenienceStore, and ProfessionalService extend it
 * with details of their own.
 *
 * @Hamna
 */

public class Business {

//attributes
private String name;
private String city;
private int employees;

/**
* Creates a business. A number of employees below 1 is ignored,
* and the count stays at 0.
*
* @param name the name of the business
* @param city the city the business is in
* @param employees the number of people who work there
*/
public Business(String name, String city, int employees) {
    this.name = name;
    this.city = city;
    setEmployees(employees);
}

/**
     * Returns this business's name.
     *
     * @return the name
     */
public String getName() {
    return name;
}

/**
     * Returns the city this business is in.
     *
     * @return the city
     */
public String getCity() {
    return city;
}

/**
     * Returns the number of people who work at this business.
     *
     * @return the number of employees
     */
public int getEmployees() {
    return employees;
}

/**
     * Changes this business's name. A null or empty name is ignored.
     *
     * @param name the new name
     */
public void setName(String name) {
    if (name != null && !name.isEmpty()) {
        this.name = name;
    }
}

/**
     * Changes the city this business is in. A null or empty city is ignored.
     *
     * @param city the new city
     */
public void setCity(String city) {
    if (city != null && !city.isEmpty()) {
        this.city = city;
    }
}

/**
     * Changes the number of people who work at this business.
     * A number below 1 is ignored.
     *
     * @param employees the new number of employees
     */
public void setEmployees(int employees) {
    if (employees >= 1) {
        this.employees = employees;
    }
}

/**
     * Returns what kind of business this is. Child classes can replace this
     * with their own answer.
     *
     * @return the type of business
     */
    public String getType() {
        return "Business";
}

/**
     * Returns a label for how big this business is. Child classes can replace
     * this with their own answer.
     *
     * @return a size label
     */
    public String getSizeLabel() {
        return "Business";
}

/**
     * Returns this business as a line of text.
     *
     * @return the name, city and number of employees
     */
    public String toString() {
        return name + " in " + city + " (" + employees + " employees)";
    }
}