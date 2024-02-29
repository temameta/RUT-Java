package laba8;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        cone();
        sheep();
    }
    static void cone() {
        Cone cone1 = new Cone(Double.parseDouble(scanner.next()), Double.parseDouble(scanner.next()));
        Cone cone2 = new Cone(Double.parseDouble(scanner.next()), Double.parseDouble(scanner.next()));
        System.out.println(String.format("Area = %d", cone1.getArea()));
        System.out.println(String.format("Volume = %d", cone1.getVolume()));
        System.out.println(String.format("Area = %d", cone2.getArea()));
        System.out.println(String.format("Volume = %d", cone2.getVolume()));
        if(cone1.isEqualAreas(cone2)) System.out.println("Area is equal");
        else System.out.println("Area is not equal");
        if(cone1.isEqualVolumes(cone2)) System.out.println("Volume is equal");
        else System.out.println("Volume is not equal");

    }
    static void sheep() {
        Sheep sheep = new Sheep(scanner.next(), scanner.next(), Integer.parseInt(scanner.next()));
        System.out.println(sheep.getInfo());
    }
}
