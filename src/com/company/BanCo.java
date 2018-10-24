package com.company;

import java.util.Scanner;

public class BanCo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr1[] = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String arr2[] = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String arr[][] = new String[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr1[i] + arr2[j];
            }
        }
        System.out.println("bàn cờ: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Nhap vi tri quan xe: ");
        String pos = sc.nextLine();
        String test1 = pos.substring(0, 1);
        String test2 = pos.substring(1, 2);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (test1.equals(arr1[i].substring(0,1)) || test2.equals(arr2[j].substring(0,1))) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}

