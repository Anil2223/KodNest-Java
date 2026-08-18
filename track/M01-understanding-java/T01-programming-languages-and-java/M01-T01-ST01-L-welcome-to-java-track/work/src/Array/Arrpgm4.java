package Array;

import java.util.Scanner;

public class Arrpgm4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter value in  array :");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array element :");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }
        System.out.println("total: " + sum);

    }

}
