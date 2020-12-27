package com.wxywizard.exercise.algorithm;

public class Selectsort {

    /**
     * 时间复杂度O(n^2)
     * @param array
     */
    public static void sort(int[] array){
        int i, j, temp;
        for (i=0; i<array.length-1; i++){
            for (j=i+1; j< array.length; j++){
                if (array[j] < array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


}
