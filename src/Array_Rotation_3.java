
//3.Array Rotation:Given an array, rotate it to the right by one position.
//For example, if the array is [1, 2, 3, 4, 5], the rotated array would be [5, 1, 2, 3, 4].

import java.util.Arrays;
public class Array_Rotation_3 {

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};
                if (arr == null || arr.length <= 1) {
                    // Nothing to rotate for an empty array or an array with only one element
                    return;
                }

                // Save the last element in a temporary variable
                int lastElement = arr[arr.length - 1];

                // Shift elements to the right by one position
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }

                // Put the last element at the beginning of the array
                arr[0] = lastElement;

        System.out.println(Arrays.toString(arr));
            }

            //Left Shift
//    public static void main(String[] args) {
//        int[] arr= {1 ,2 ,3 ,4, 5};
//
//        int first = arr[0];
//
//        for(int i= 1 ; i< arr.length ; i++){
//            arr[i-1] = arr[i];
//        }
//        arr[arr.length-1] =first;
//        System.out.println(Arrays.toString(arr));


    }



