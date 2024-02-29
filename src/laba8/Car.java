package laba8;

public class Car {
    private String make = "unknown";
    private String model = "unknown";
    private int horsePower = -1;

    public void setModel(String model) {
        if (model != null && !model.isBlank() && model.length() > 1) this.model = model;
        else throw new Error("Model should be more than 1 symbol");
    }

    public void setMake(String make) {
        if (make != null && !make.isBlank() && make.length() > 1) this.make = make;
        else throw new Error("Make should be more than 1 symbol");
    }

    public void setHorsePower(int horsePower) {
        if (horsePower > 0) this.horsePower = horsePower;
        else throw new Error("Horse Power should be more than 0");
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getHorsePower() {
        return horsePower;
    }

//    public Car(String make) {
//        this.setMake(make);
//    }
//
//    public Car(String make, String model) {
//        this(make);
//        this.setModel(model);
//    }

    public Car(String make, String model, int horsePower) {
        //this(make, model);

        this.setHorsePower(horsePower);
    }

    public String getInfo() {
        return String.format("The car is: %s %s - %d HP.", this.make, this.model, this.horsePower);
    }
}
