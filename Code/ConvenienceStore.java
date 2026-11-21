// ConvenienceStore is the child class for Business which is the parent class
public class ConvenienceStore extends Business {
    private boolean openLate;   // extra attribute that only this class has

    // constructor: super sends the shared data to the parent class Business
    public ConvenienceStore(String name, String city, int employees) {
        super(name, city, employees);
        openLate = false;
    }

    // getter for the extra attribute
    public boolean isOpenLate() {
        return openLate;
    }

    // setter: changes whether the store is open late
    public void setOpenLate(boolean openLate) {
        this.openLate = openLate;
    }

    @Override
    // replaces the parent version
    public String getType() {
        return "Convenience Store";
    }

    @Override
    // replaces the parent version: corner store or busy store
    public String getSizeLabel() {
        if (getEmployees() <= 3) {
            return "Corner store";
        } else {
            return "Busy store";
        }
    }

    // how many full shifts of 3 people (integer division)
    public int getFullShifts() {
        return getEmployees() / 3;   // integer division
    }

    // how many people are left over (modulo)
    public int getExtraStaff() {
        return getEmployees() % 3;   // modulo (the remainder)
    }
}