import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter comma separated list of integers to form unsorted input array.");
        String inputString = scanner.nextLine();

        String[] inputArrayString = inputString.split(",\\s*");

        int[] unsortedArray = new int[inputArrayString.length]; 

        for (int i=0; i<inputArrayString.length; i++) {
            unsortedArray[i] = Integer.parseInt(inputArrayString[i].trim());
        }

        int[] sortedArray = BubbleSort.getSortedArray(unsortedArray);

        System.out.println(Arrays.toString(sortedArray)); 
    }
}

class BubbleSort {
    public static int[] getSortedArray(int[] unsortedArray) {
        int temp;
        for (int i=0; i < unsortedArray.length; i++) {
            if (i == unsortedArray.length - 1) {
                return unsortedArray;
            }
            if (unsortedArray[i] > unsortedArray[i+1]) {
                temp = unsortedArray[i];
                unsortedArray[i] = unsortedArray[i+1];
                unsortedArray[i+1] = temp;
            }
        }
        return unsortedArray;
    }
}