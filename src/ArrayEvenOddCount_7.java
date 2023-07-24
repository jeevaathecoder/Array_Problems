//7.Array Even-Odd Count: Given an array of integers,
// count the number of even and odd elements in the array.


public class ArrayEvenOddCount_7 {
    public static void main(String[] args) {
        int[] arr ={3,5,3,43,223,6,64,36,22,343,654,23};
        int oddCount=0;
        int evenCount=0;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] %2 ==0 ){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        System.out.println(evenCount);
        System.out.println(oddCount);
    }
}
