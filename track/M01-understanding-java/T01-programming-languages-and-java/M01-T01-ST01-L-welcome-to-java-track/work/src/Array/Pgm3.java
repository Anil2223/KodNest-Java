import java.util.Scanner;

public class Pgm3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][][] arr = { { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } },
                { { 13, 14, 15, 32 }, { 16, 17, 18, 31 },
                        { 19, 20, 21, 30 } } };

        // new code write here for print
        System.out.println("your element print :");

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                for (int k = 0; k <= arr[i][j].length - 1; k++) {
                    System.out.print(" " + arr[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }

        int block = arr.length;

        int row = arr[0].length;
        int colm = arr[0][0].length;
        int totallength = block * row * colm;
        System.out.println("total length " + totallength);
        System.out.println("block length arr.length " + block);
        System.out.println("row length arr[0].length " + row);
        System.out.println("column arr[0][0].length " + colm);

        System.out.println(arr[0][0][0]);
        System.out.println(arr[1][2][2]);

    }

}
