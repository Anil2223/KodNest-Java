import java.util.Scanner;

public class ThreeDimensionalArray {

    public static void main(String[] args) {

        int[][][] arr = new int[3][3][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter element :");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                for (int k = 0; k <= arr[i][j].length - 1; k++) {
                    arr[i][j][k] = scanner.nextInt();
                }
            }
        }
        System.out.println("Array Elements are :");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                for (int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
