package Array;

public class Freq {
    public void findVal(int[] arr, int key) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println("Repeatation of " + key + " is " + count + " times");
    }
}
