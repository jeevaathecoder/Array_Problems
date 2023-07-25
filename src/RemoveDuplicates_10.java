//Array Unique Elements:
//  Write a function to remove duplicates from an array and
//  return the updated array with unique elements.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates_10 {


    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 4, 4, 5, 5, 5};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
             }

            if (count == 0) {
                System.out.print(arr[i]+ " ");
            }
        }
    }
}


//By using Hash Set Method
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 5};
//        int n = arr.length;
//
//        // Use a HashSet to store unique elements
//        Set<Integer> uniqueSet = new HashSet<>();
//
//        // Traverse the input array and add unique elements to the HashSet
//        for (int i = 0; i < n; i++) {
//            uniqueSet.add(arr[i]);
//        }
//        System.out.println(uniqueSet);
//    }
