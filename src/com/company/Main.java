package com.company;

public class Main {

    public static void main(String[] args) {
        double[] arrays = {2, 10.1, -9.0, 3.6, 4.9, 7.1, -2.6, 5.0, 11.1, 1.6, 6.4, 8.1, 7.6, 3.4, 12.1};
        boolean isPositive = false;
        double sum = 0;
        double number = 0;
        for (double array : arrays) {
            if (isPositive) {
                sum += array;
                number++;
            } else if (array < 0.0) {
                isPositive = true;
            }
        }
        double res = (sum / number);
        System.out.println(res);
    }
}
