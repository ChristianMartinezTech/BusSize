package app.bussize;

import java.util.Arrays;

/***
 * BusSize Class that stores the method to find the possible seat combinations
 */
public class BusSize {
    /***
     * Method that will find all the possible ordered seat combinations
     * @param groups integer[] containing the groups
     * @return integer[] containing the possible ordered seat combinations
     */
    public static String findChairSize(String groups) {
        int highestValue = 0;
        int passengerTotal = 0;
        int temp = 0;
        int noSeats;
        int[] numbers = Arrays.stream(groups.split(",")).mapToInt(Integer::parseInt).toArray();
        String response = "";

        for (int i = 0; i < numbers.length; i++) { // Finding highestValue and passengerTotal
            if (numbers[i] > highestValue) {
                highestValue = numbers[i];
            }
            passengerTotal += numbers[i];
        }

        noSeats = highestValue; // noSeats will go from the biggest group to half the total of passengers

        while (noSeats <= (passengerTotal / 2)) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] <= noSeats) {
                    temp += numbers[j];
                }
                if (temp == noSeats) {
                    temp = 0;
                }
            }
            if (temp == 0) {
                response += String.valueOf(noSeats) + ','; // Adding noSeats to responseArrList
            } else {
                temp = 0; // Restarting the temp count
            }
            noSeats += 1;
        }

        // Adding the last digit since it will always be total of passengers
        response += String.valueOf(passengerTotal);
        return response;
    }
}

