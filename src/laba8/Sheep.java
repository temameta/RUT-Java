package laba8;

public class Sheep {
    private String name = new String(""), gender = new String("");
    private int age = 0;

    public void setName(String name) {
        if (!name.isBlank()) this.name = name;
        else throw new Error("NameBlank");
    }

    public void setGender(String gender) {
        if (!gender.isBlank() && (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) this.gender = gender;
        else throw new Error("InvalidGender");
    }

    public void setAge(int age) {
        if (age > 0) this.age = age;
        else throw new Error("AgeLessThanZero");
    }

    public Sheep(String name, String gender, int age) {
        setAge(age);
        setName(name);
        setGender(gender);
    }

    private int getProductivity() {
        if (this.age < 1) {
            return 0;
        }
        switch (this.gender.toLowerCase()) {
            case "male":
                return 14;
            case "female":
                return 8;
            default:
                return -1;
        }
    }

    public void addOneYear() {
        this.age++;
    }

    public String getInfo() {
        return String.format("Sheep %s gives %d kg of wool per cut", this.name, getProductivity());
    }
}
