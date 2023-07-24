
//5.Array Search: Given an array of integers and a target value,
// write a function to check if the target value exists in the array.


public class Target_Search_5 {
    public static void main(String[] args) {
        int[] arr= { 1,2,3,5,10,36};
        int target = 3;

        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid = ( start+ end ) /2;

            if(arr[mid ] == target){
                System.out.println(mid);
                break;
            } else if (arr[mid] < target) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }
}
