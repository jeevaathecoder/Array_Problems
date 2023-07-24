//1.Sum of Array Elements:
// Write a function to calculate the sum of all elements in an integer array.

public class SumofArray_1 {
    public static void main(String[] args) {
        int[] arr= {4,6,7,2,2,2};
        int sum =0;
        for(int i=0; i< arr.length ; i++){
            sum+=arr[i];
        }

        System.out.println(sum);
    }
}