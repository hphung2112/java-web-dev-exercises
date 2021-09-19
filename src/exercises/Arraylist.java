package exercises;

import java.util.ArrayList;


public class Arraylist {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 8};
        System.out.println();
    }
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }
}

