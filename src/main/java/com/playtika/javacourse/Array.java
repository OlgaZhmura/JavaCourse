package com.playtika.javacourse;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] numbers1 = {40, 95, 66, 3, 5};
        int[] numbers2 = {40, 85, 67, 9, 4};

        for(int i=0; i<numbers.length; i++){
            numbers[i] = numbers.length - i - 1;
        }

        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }

        int sum=0;
        for(int i=0; i<numbers.length; i++){
           sum += numbers[i];
        }
        /*
        for(int number : numbers){   //foreach example, can't use it for array changing
        sum += number;
        }
         */
        System.out.println(sum);

        // work with array by Arrays class
        Arrays.fill(numbers, 6);
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.equals(numbers1, numbers2));

        int[] numbers3 = Arrays.copyOf(numbers1, numbers1.length);
        System.out.println(Arrays.equals(numbers1, numbers3));

        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1)); //print array in string
        //search element in sort array compare element with mid array element and return index
        //return - if not find element in array
        int i = Arrays.binarySearch(numbers1, 66);
        System.out.println(i);
    }
}
