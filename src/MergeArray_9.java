
//Array Merge:
// Given two sorted arrays, merge them into a single sorted array.

import java.util.Arrays;
public class MergeArray_9 {


    public static void main(String[] args) {
            int[] arr1= { 2,5,8,10,15,21};
            int[] arr2 = {1,6,7,11,13};
            int n1 = arr1.length;
            int n2 = arr2.length;
            int[] mergedArray = new int[n1 + n2];

            int i = 0; // Index for arr1
            int j = 0; // Index for arr2
            int k = 0; // Index for mergedArray

            // Compare elements from both arrays and insert them into the mergedArray
            while (i < n1 && j < n2) {
                if (arr1[i] <= arr2[j]) {
                    mergedArray[k] = arr1[i];
                    i++;
                } else {
                    mergedArray[k] = arr2[j];
                    j++;
                }
                k++;
            }

            // Copy any remaining elements from arr1 (if any)
            while (i < n1) {
                mergedArray[k] = arr1[i];
                i++;
                k++;
            }

            // Copy any remaining elements from arr2 (if any)
            while (j < n2) {
                mergedArray[k] = arr2[j];
                j++;
                k++;
            }

        System.out.println(Arrays.toString(mergedArray));
        }

}
