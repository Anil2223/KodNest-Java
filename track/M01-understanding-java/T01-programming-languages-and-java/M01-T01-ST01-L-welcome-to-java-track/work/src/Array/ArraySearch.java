package Array;

public class ArraySearch {
    public void arrsearch(int[] arr, int key) {
        boolean found = false;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                System.out.println("Element found . ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Element not found !");
        }
    }
}
