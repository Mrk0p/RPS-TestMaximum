package com.bridgelabz.maximum;

public class TestMaximum {

    public static void main(String[] args) {

        String name1 = "Apple";
        String name2 = "Peach";
        String name3 = "Banana";
        String maximum = testMax(name1, name2, name3);
        System.out.println("Maximum length of string is : " + maximum);
    }

    public static String testMax(String number1, String number2, String number3) {

        String maximumNumber = number1;
        if (number2.compareTo(maximumNumber) > 0) {
            maximumNumber = number2;
        }
        if (number3.compareTo(maximumNumber) > 0) {
            maximumNumber = number3;
        }
        return maximumNumber;
    }
}
