/*
 * Name: Business
 * Description:
 * Created by: Hamna
 * Last edited: 11-20-2026
 */

public class Business {

//attributes
private String name;
private String city;
private int employees;

// contructors
public Business(String name, String city, int employees) {
    this.name = name;
    this.city = city;
    setEmployees(employees);
}

// getter: this will let the child classes read the name
public String getName() {
    return name;
}

// getter: this will let the child classes read the city
public String getCity() {
    return city;
}

// getter: this will let the child class read the employee count
public int getEmployees() {
    return employees;
}

// setter: changes the name, ONLY if it isn't empty
public void setName(String name) {
    if (name != null && !name.isEmpty()) {
        this.name = name;
    }
}

// setter: changes the city, ONLY if it isn't empty
public void setCity(String city) {
    if (city != null && !city.isEmpty()) {
        this.city = city;
    }
}

// setter: changes the employee count, only if it isn't empty
public void setEmployees(int employees) {
    if (employees >= 1) {
        this.employees = employees;
    }
}

// the child classes can replace this
    public String getType() {
        return "Business";
}

    // the child classes replace this 
    public String getSizeLabel() {
        return "Business";
}

    // turns the business into a line of text for printing
    public String toString() {
        return name + " in " + city + " (" + employees + " employees)";
    }
}