package laba9;

public class Airplane extends Vehicle {
    private int wingsCount, engineNumber;
    private boolean isHydroplane;

    public Airplane(int passengers, int wingsCount, int engineNumber, boolean isHydroplane) {
        super(passengers);
        setHydroplane(isHydroplane);
        setEngineNumber(engineNumber);
        setWingsCount(wingsCount);
    }

    public void setWingsCount(int wingsCount) {
        if (wingsCount > 0) {
            if (wingsCount > 1) this.wingsCount = wingsCount;
            else throw new IllegalArgumentException("Need wings to fly!");
        } else throw new IllegalArgumentException("Invalid negative number! Argument: wings count");
    }

    public void setEngineNumber(int engineNumber) {
        if (engineNumber > 0) {
            if (engineNumber < 8 || engineNumber == 10 || engineNumber == 12) this.engineNumber = engineNumber;
            else throw new IllegalArgumentException("Invalid engines number!");
        } else throw new IllegalArgumentException("Invalid negative number! Argument: engine count");
    }

    public void setHydroplane(boolean hydroplane) {
        isHydroplane = hydroplane;
    }

    @Override
    public String toString() {
        return String.format("In %s %d passengers \nWith %d wings and %d engines", isHydroplane ? "a Hydroplane" : "an Airplane", this.passengers, this.wingsCount, this.engineNumber);
    }
}
