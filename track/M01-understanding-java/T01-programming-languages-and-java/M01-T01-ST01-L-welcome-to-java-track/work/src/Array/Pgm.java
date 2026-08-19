
import java.util.Scanner;

class Pgm {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];
        System.out.println("Enter array element :");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Array Element :");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }

    }
}