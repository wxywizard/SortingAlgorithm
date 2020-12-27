package com.wxywizard.exercise.algorithm;

public class BubbleSort {

    public static void sort(int[] array){
        if (array == null || array.length == 0){
            return;
        }
        int length = array.length;
        for (int i = 0; i < length-1; i++){
            for (int j = 0; j < length-1-i; j++){
                if (array[j] > array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
          int[] test = new int[]{3,4,7,1,9,5,3,7,8};
          sort(test);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }

    }

}
