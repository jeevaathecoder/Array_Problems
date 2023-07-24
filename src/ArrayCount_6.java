//5.Array Search: Given an array of integers and a target value,
//write a function to check if the target value exists in the array.


public class ArrayCount_6 {
    public static void main(String[] args) {
        int[] arr = { 2,4,23,2,4,5,2,5,4,3,1};
        int target =2;
        int count =0;
        for(int i = 0;i< arr.length ; i++){
            if(arr[i ] == target) {
                count++;
            }
        }

        System.out.println(count);
    }
}
