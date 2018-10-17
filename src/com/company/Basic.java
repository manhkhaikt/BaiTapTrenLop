package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
      int[] a = {2, 4, 3, 5, 7};
        System.out.println("Nhap phan tu can tim");
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt(), c = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == b){
                c = i;
            }
        }
        if(c == 0){
            System.out.println("NotFound");
        }
        else System.out.println("vi tri cua phan tu can tim la: "+c );
        System.out.println("---------------------------------");

        int[] d = new int[a.length];
        int n = 0;
        while (n < a.length){
            d[n] = a[n];
            n++;
        }
        System.out.println(Arrays.toString(d));
        System.out.println("--------------------------------");

        int min = 0, max = 0;
        for(int i = 1; i < a.length; i++){
            if(a[i]<a[i-1]) {
                max = a[i-1];
                min = a[i];
            }
            else{
                max = a[i];
                min = a[i-1];
            }
        }
        System.out.println("max: " +max + "  min: "+min);
        System.out.println("-------------------------------");
    }
}
