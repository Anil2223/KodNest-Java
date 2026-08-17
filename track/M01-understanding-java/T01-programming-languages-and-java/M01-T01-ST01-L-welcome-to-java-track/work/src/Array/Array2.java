package Array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int arr[] = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Element :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array Element are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
