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


        for (Integer group : groups) { // Finding highestValue and passengerTotal
            if (group > highestValue) {
                highestValue = group;
            }
            passengerTotal += group;
        }

        noSeats = highestValue; // noSeats will go from the biggest group to half the total of passengers

        while (noSeats <= (passengerTotal / 2)) {
            for (Integer group : groups) {
                if (group < noSeats) {
                    temp += group;
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

