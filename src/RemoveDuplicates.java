//Array Unique Elements:
//  Write a function to remove duplicates from an array and
//  return the updated array with unique elements.

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 5};
        int n = arr.length;

        // Create a new array to store unique elements
        int[] uniqueArr = new int[n];
        int j = 0;

        // Traverse the input array and copy unique elements to uniqueArr
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if the current element is a duplicate
            for (int k = 0; k < j; k++) {
                if (arr[i] == uniqueArr[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If the current element is not a duplicate, add it to uniqueArr
            if (!isDuplicate) {
                uniqueArr[j] = arr[i];
                j++;
            }
        }

        // Resize uniqueArr to the correct size (number of unique elements)
        System.out.println(Arrays.toString(Arrays.copyOf(uniqueArr, j)));

    }
}
