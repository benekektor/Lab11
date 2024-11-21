package com.chmnu_ki_123.k3;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] ints = {0,2,4,6,8,10};

        int index = Arrays.binarySearch(ints, 6);

        System.out.println(index);
    }
}