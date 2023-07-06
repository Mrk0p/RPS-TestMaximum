package com.bridgelabz.maximum;

public class TestMaximum {

    public static Integer testMax(Integer num1, Integer num2, Integer num3) {

        Integer maximumNum = num1;
        if (num2.compareTo(maximumNum) > 0) {
            maximumNum = num2;
        }
        if (num3.compareTo(maximumNum) > 0) {
            maximumNum = num3;
        }
        return maximumNum;

    }

    public static void main(String[] args) {

        Integer num1 = 2;
        Integer num2 = 3;
        Integer num3 = 5;
        Integer maximumNumber = testMax(num1,num2,num3);
        System.out.println("Maximum number is :" +maximumNumber);
    }
}
