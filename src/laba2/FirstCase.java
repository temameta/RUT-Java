package laba2;

import java.util.Scanner;

public class FirstCase {
    public static void main(String[] args) {
        String departureTime, arrivalTime, technicalStopTimeInString = "";
        int travelTime, arrivalMinutes, departureMinutes, technicalStopTime, technicalStopHours, technicalStopMinutes;
        Scanner sc = new Scanner(System.in);
        departureTime = sc.nextLine();
        arrivalTime = sc.nextLine();
        travelTime = sc.nextInt();
        if (departureTime.length() != 5 || arrivalTime.length() != 5 || Integer.parseInt(departureTime.substring(0, 2)) < 0 || Integer.parseInt(departureTime.substring(0, 2)) > 23 || Integer.parseInt(arrivalTime.substring(0, 2)) < 0 || Integer.parseInt(arrivalTime.substring(0, 2)) > 23 || Integer.parseInt(arrivalTime.substring(3)) < 0 || Integer.parseInt(arrivalTime.substring(3)) > 59 || Integer.parseInt(departureTime.substring(3)) < 0 || Integer.parseInt(departureTime.substring(3)) > 59 || travelTime < 0) {
            System.out.println("Invalid time");
        } else if (arrivalTime.equals(departureTime)) {
            System.out.println(24 * 60 - travelTime);
        } else {
            departureMinutes = Integer.parseInt(departureTime.substring(0, 2)) * 60 + Integer.parseInt(departureTime.substring(3));
            arrivalMinutes = Integer.parseInt(arrivalTime.substring(0, 2)) * 60 + Integer.parseInt(arrivalTime.substring(3));
            if (!(arrivalMinutes > departureMinutes)) {
                if (Integer.parseInt(departureTime.substring(0, 2)) < 12) {
                    departureMinutes += 24 * 60;
                }
                if (Integer.parseInt(arrivalTime.substring(0, 2)) < 12) {
                    arrivalMinutes += 24 * 60;
                }
            }
            technicalStopTime = Math.abs(travelTime - Math.abs(arrivalMinutes - departureMinutes));
            technicalStopHours = technicalStopTime / 60;
            technicalStopMinutes = technicalStopTime - ((technicalStopTime / 60) * 60);
            if (technicalStopHours < 10) {
                technicalStopTimeInString += "0";
            }
            technicalStopTimeInString += technicalStopHours;
            technicalStopTimeInString += ":";
            if (technicalStopMinutes < 10) {
                technicalStopTimeInString += "0";
            }
            technicalStopTimeInString += technicalStopMinutes;
            System.out.println(technicalStopTimeInString);
        }
        sc.close();
    }
}
