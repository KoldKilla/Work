package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of Fibonacci numbers you want to get: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}
