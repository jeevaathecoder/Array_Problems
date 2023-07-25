
//4.Array Reversal:
// Write a program to reverse the elements of an integer array.

import java.util.Arrays;
public class Reverse_Array_4 {
    public static void main(String[] args) {
        int[] arr = {11,22,45,87,23,45,22};

        int i= 0;
        int j=arr.length-1;

        while(i <= j){

            if(i == j ){
                break;
            }
            swap(arr,i,j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}


//Another Metho 2:
//public class Reverse_Array_5 {
//    public static void main(String[] args) {
//        int[] arr = {4, 6, 23, 45, 22, 1, 5};
//
//        int length = arr.length;
//        for (int i = 0; i < length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[length - i - 1];
//            arr[length - i - 1] = temp;
//        }
//
//        System.out.println(Arrays.toString(arr));
//    }
//}
