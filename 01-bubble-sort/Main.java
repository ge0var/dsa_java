import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {10, 20, 50, 43, 69, 1};
        int[] sortedArray = BubbleSort.getSortedArray(unsortedArray);

        System.out.println(Arrays.toString(sortedArray)); 
    }
}

class BubbleSort {
    public static int[] getSortedArray(int[] unsortedArray) {
        int[] sortedArray = unsortedArray;
        return sortedArray;
    }
}