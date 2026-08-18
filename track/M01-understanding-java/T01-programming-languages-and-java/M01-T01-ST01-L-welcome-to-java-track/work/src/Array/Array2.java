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

        int b[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            b[j] = arr[i];
            j++;
        }
        System.out.println("B array element output ");
        for (j = 0; j <= b.length - 1; j++) {
            System.out.println(b[j]);
        }
        j = b.length - 1;

        for (int i = 0; i <= arr.length - 1; i++) {
            b[j] = arr[i];
            j--;
        }
        System.out.println("printing B value as assigned reverse value :");
        for (int i = 0; i <= b.length - 1; i++) {
            System.out.println(b[i]);
        }
        System.out.println("b value assigned  to c as referrence to poting to value b");
        int c[] = b;
        for (int i = 0; i <= c.length - 1; i++) {
            System.out.println(c[i]);
        }
        
        scanner.close();

    }
}
