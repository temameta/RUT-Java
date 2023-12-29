package laba4;

import java.util.Scanner;

public class SecondCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wallet = 0, value = 0;
        String place = "", state = "idle";
        String inputString = sc.nextLine();
        while (!(inputString.equalsIgnoreCase("stop"))) {
            if (state.equals("idle")) {
                if (inputString.matches("[a-zA-ZА-Яа-я]+") && place.isEmpty()) place = inputString;
                else if (inputString.matches("[0-9]+")) {
                    if (place.isEmpty()) wallet += Integer.parseInt(inputString);
                    else value = Integer.parseInt(inputString);
                }
                if (value > 0)  {
                    state = "location determined";
                    inputString = "0";
                }
            }
            if (state.equals("location determined")) {
                if (inputString.matches("[0-9]+")) wallet += Integer.parseInt(inputString);
                if (wallet - value >= 0) {
                    System.out.println("Going to " + place);
                    wallet = 0;
                    place = "";
                    value = 0;
                    state = "idle";
                }
            }
            inputString = sc.nextLine();
        }
    }
}