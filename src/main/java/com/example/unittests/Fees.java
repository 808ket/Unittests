package com.example.unittests;

/**
 * Fees is used to contain the function estimateFee.
 *
 *
 */
public class Fees {
    /**
     * <p>This method is used to estimate the fee that needs to be paid for speeding.
     * </p>
     * @param speedingValue the amount over the speed limit in km/h.
     * @return the fee that has to be paid for speeding.
     */
    protected double estimateFee(int speedingValue) {
        double result = 0;

        if (0 < speedingValue && speedingValue <= 10) {
            result = 48.50;
        } else if (11 <= speedingValue && speedingValue <= 15) {
            result = 68.50;
        } else if (16 <= speedingValue && speedingValue <= 20) {
            result = 88.50;
        } else if (21 <= speedingValue && speedingValue <= 25) {
            result = 128.50;
        } else if (26 <= speedingValue && speedingValue <= 30) {
            result = 178.50;
        } else if (31 <= speedingValue && speedingValue <= 40) {
            result = 228.50;
        } else if (41 <= speedingValue && speedingValue <= 50) {
            result = 348.50;
        } else if (51 <= speedingValue && speedingValue <= 60) {
            result = 508.50;
        } else if (61 <= speedingValue && speedingValue <= 70) {
            result = 633.50;
        } else if (speedingValue > 70) {
            result = 738.50;
        }

        return result;
    }
}
