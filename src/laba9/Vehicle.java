package laba9;

public class Vehicle {
    protected int passengers;

    public Vehicle(int passengers) {
        setPassengers(passengers);
    }

    public void setPassengers(int passengers) {
        if (passengers > 0) {
            if (passengers > 1) this.passengers = passengers;
            else throw new IllegalArgumentException("Need passengers to drive!");
        } else throw new IllegalArgumentException("Invalid negative number! Argument: passengers");
    }
}
