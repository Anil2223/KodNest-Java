
import java.util.Scanner;

class Pgm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[5];
        System.out.println("Enter Array val: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                arr[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
}