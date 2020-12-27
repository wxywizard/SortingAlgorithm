package com.wxywizard.exercise.algorithm;

public class InsertionSort {

    public static void sort(int[] array){
        int i,j, temp;
        for (i = 0; i < array.length; i++){
            temp = array[i];
            for (j = i-1; j>=0 && array[j]>temp; j--){
                array[j+1] = array[j];
            }
            array[j+1] = temp;
        }
    }
}
