// HairSalon is the child class for Business which is the parent class
public class HairSalon extends Business {
    private int chairs;   // extra attribute that only this child class has

    // constructor: super sends the shared data to the parent class Business
    public HairSalon(String name, String city, int employees) {
        // super sends the data up to the Business constructor
        super(name, city, employees);
        chairs = getEmployees();
    }

    // getter for the extra attribute
    public int getChairs() {
        return chairs;
    }

    // setter: changes chairs (the extra attribute), ONLY if it is at least 1
    public void setChairs(int chairs) {
        if (chairs >= 1) {
            this.chairs = chairs;
        }
    }

    @Override
    // replaces the parent version
    public String getType() {
        return "Hair Salon";
    }

    @Override
    // replaces the parent version: small or large salon
    public String getSizeLabel() {
        if (getEmployees() < 5) {
            return "Small salon";
        } else {
            return "Large salon";
        }
    }

    // how many full pairs of stylists (integer division)
    public int getStylistPairs() {
        return getEmployees() / 2;   // integer division
    }

    // how many stylists are left over (modulo)
    public int getLeftover() {
        return getEmployees() % 2;   // modulo (the remainder)
    }
}