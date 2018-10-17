package com.company;

import java.util.Arrays;

public class Advance {
    public static void main(String[] args) {
        int[] arr = {6, 2, 3, 8};

        System.out.println(makeArrayConsecutive2(arr));
        System.out.println("-----------------------------------------------");
        int[] arr1 = {3,6,-2,-5,7,3};
        System.out.println(adjacentElementsProduct(arr1));
        System.out.println("-----------------------------------------------");

        int[] arr2 = {2, 1, 3, 5, 3, 2};
        System.out.println(firstDuplicate(arr2));
        System.out.println("------------------------------------------------");
    }
    static int adjacentElementsProduct(int[] arr){
        int a = 0;
        for(int i = 1; i < arr.length - 1; i++){
            a = arr[i]*arr[i-1] > arr[i]*arr[i+1]?arr[i]*arr[i-1]:arr[i]*arr[i+1];
        }
        return a;
    }
    static int makeArrayConsecutive2(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        for (int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i - 1] == 1) continue;
            else count += arr[i] - arr[i -1] - 1 ;
        }
        return count;
    }
    static int firstDuplicate(int[] arr){
        int a = 0, b = arr.length;

        for (int i = 0; i < arr.length -1; i++){
            for (int j = i +1; j < arr.length; j++){
                if (arr[i]==arr[j]){
                    if(b > j -i){
                    a = arr[i];
                    b = j -i;
                    }
                }
            }
        }
        if (b < arr.length)
        return a;
        else return -1;
    }
}
