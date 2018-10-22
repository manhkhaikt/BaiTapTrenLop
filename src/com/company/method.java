package com.company;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.println("Nhap chuoi: ");
        input = scan.next();
        System.out.println(checkPalindrome(input));
        System.out.println("--------------------------------------");


        System.out.println("Nhap so n:");
        int n = scan.nextInt();
        System.out.println("Nhap fist number: ");
        int firstNumber = scan.nextInt();
        System.out.println("So doi dien: " + circleOfNumbers(n, firstNumber));
        System.out.println("-------------------------------------------");

        int[][] matrix={{0,1,1,2},{0,5,0,0},{2,0,3,3}};
        System.out.println("CodeBots: "+matrixElementsSum(matrix));
    }

    static boolean checkPalindrome(String a) {
        char[] newArr = a.toCharArray();
        int test = 0;
        if (a.length() % 2 != 0) {
            int count1 = 1;
            for (int i = a.length() / 2; i < a.length() - 1; i++) {
                if (newArr[a.length() / 2 + count1] != newArr[a.length() / 2 - count1]) test = 1;
                count1++;
            }
        } else if (a.length() % 2 == 0) {
            int count2 = 1;
            for (int j = a.length() / 2; j < a.length(); j++) {
                if (newArr[j] != newArr[a.length() / 2 - count2]) test = 1;
                count2++;
            }

        }
        if (test == 1) return false;
        else return true;
    }

    static int circleOfNumbers(int n, int firstNumber) {
        int numOpposite = 0;
        for (int i = 0; i < n; i++) {
            if (firstNumber > n / 2) {
                numOpposite = firstNumber - n / 2;
            } else if (firstNumber < n / 2) {
                numOpposite = firstNumber + n / 2;
            }
        }
        return numOpposite;
    }

    static int matrixElementsSum(int[][] matrix) {
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 0) break;
                else sum += matrix[i][j];
            }
        }

        return sum;
    }
}
