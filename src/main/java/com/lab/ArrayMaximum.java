package com.lab;

public class ArrayMaximum {

    public int findMaximum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int max = numbers[0];

        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 20};

        ArrayMaximum obj = new ArrayMaximum();
        System.out.println("Maximum = " + obj.findMaximum(numbers));
    }
}