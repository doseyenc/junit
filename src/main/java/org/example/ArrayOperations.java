package org.example;

public class ArrayOperations {
     static int findMinimumValue(int [] array){
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            int value = array [i];
            if(value < minimum){
                minimum = value;
            }
        }
        return minimum;
    }
     static int findMaximumValue(int [] array){
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            int value = array [i];
            if(value > maximum){
                maximum = value;
            }
        }
        return maximum;
    }
}
