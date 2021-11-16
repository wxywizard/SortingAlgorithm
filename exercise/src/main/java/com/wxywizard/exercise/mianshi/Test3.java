package com.wxywizard.exercise.mianshi;

/**
 * @author wangxy
 * @Classname Test3
 * @Date 2021/11/16 10:57 上午
 */
public class Test3 {

    public void swap(int param1, int param2) {

        int temp;
        temp = param1;
        param1 = param2;
        param2 = temp;

    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        Test3 test = new Test3();
        test.swap(a,b);
        System.out.println(a + "," + b);
    }

}
