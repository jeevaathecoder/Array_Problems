//2.Largest Element in Array:
// Find the largest element in an array of integers.


public class Find_LargestElement_2 {
    public static void main(String[] args) {
        int[] arr= {12,4,23,-1,-6,54,1};
        int max=arr[0];

        for(int i=0; i<arr.length ; i++ ){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
