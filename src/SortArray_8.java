//8.Sort a Array

import java.util.Arrays;
public class SortArray_8 {
   public static void selectionSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                // Find the minimum element in the unsorted subarray
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                // Swap the found minimum element with the first element of the unsorted subarray
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        public static void main(String[] args) {
            int[] arr = {64, 34, 25, 12, 22, 11, 90};
            System.out.println("Original Array: " + Arrays.toString(arr));

            selectionSort(arr);
            System.out.println("Sorted Array: " + Arrays.toString(arr));
        }
    }


