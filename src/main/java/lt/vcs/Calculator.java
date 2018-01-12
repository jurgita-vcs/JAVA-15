package lt.vcs;

import java.util.Objects;

class Calculator {

    boolean isEqual(int number1, int number2) {
        return Objects.equals(number1, number2);
    }

    int findLargestNumber(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0){
            throw new IllegalArgumentException("Negative values not allowed");
        }
        int result, temp;
        /* In first step we are comparing only num1 and
         * num2 and storing the largest number into the
         * temp variable and then comparing the temp and
         * num3 to get final result.
         */
        temp = num1>num2 ? num1:num2;
        result = num3>temp ? num3:temp;
        return result;
    }
}