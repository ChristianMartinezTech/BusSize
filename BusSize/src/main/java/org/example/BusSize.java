package org.example;
import java.util.ArrayList;
import java.util.Arrays;

public class BusSize {
    /***
     * Method that will find all the possible ordered seat combinations
     * @param groups integer[] containing the groups
     * @return integer[] containing the possible ordered seat combinations
     */
    public Integer[] findChairSize(Integer[] groups) {

        int highestValue = 0;
        int passengerTotal = 0;
        int temp = 0;
        int noSeats;
        ArrayList<Integer> responseArrList = new ArrayList<>();


        for (int i = 0; i < groups.length; i++) { // Finding highestValue and passengerTotal
            if (groups[i] > highestValue) {
                highestValue = groups[i];
            }
            passengerTotal += groups[i];
        }

        noSeats = highestValue; // noSeats will go from the biggest group to half the total of passengers

        while (noSeats <= (passengerTotal / 2)) {
            for (int j = 0; j < groups.length; j++) {
                if (groups[j] <= noSeats) {
                    temp += groups[j];
                }
                if (temp == noSeats) {
                    temp = 0;
                }
            }
            if (temp == 0) {
                responseArrList.add(noSeats); // Adding noSeats to responseArrList
            } else {
                temp = 0; // Restarting the temp count
            }
            noSeats += 1;
        }

        // Adding the last digit since it will always be total of passengers
        responseArrList.add(passengerTotal);

        // Changing the ArrayList into and Integer[]
        Integer[] response = new Integer[responseArrList.size()];
        response = responseArrList.toArray(response);
        System.out.println(Arrays.toString(response));
        return response;
    }
}

