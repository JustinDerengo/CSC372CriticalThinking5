package org.justinski;

public class productCalculator {
    public productCalculator(int i) {
    }

    public static double productCalculator(double[] userNumbers, int index) {
        if (index == userNumbers.length -1) {
            return userNumbers[index];
        } else {
            return userNumbers[index] * productCalculator(userNumbers, index + 1);
        }
    }


}
