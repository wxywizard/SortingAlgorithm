package com.wxywizard.exercise.mianshi;

/**
 * @author wangxy
 * @Classname Test2
 * @Date 2021/11/16 10:55 上午
 */
public class Test2 {

    public static void main(String[] args) {
        String s = "Java";
        String s1 = "Jav" + "a";
        String s2 = new String("Java");

        System.out.println(s == s1);
        System.out.println(s1 == s2);
        System.out.println(s == s2);
    }
}
