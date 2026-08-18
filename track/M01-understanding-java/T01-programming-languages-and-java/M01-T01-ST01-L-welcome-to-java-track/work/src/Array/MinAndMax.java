package Array;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int max = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Min element: " + min);
        System.out.println("max element: " + max);

    }
}
