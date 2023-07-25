import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 5};
        int n = arr.length;

        // Use a HashSet to store unique elements
        Set<Integer> uniqueSet = new HashSet<>();

        // Traverse the input array and add unique elements to the HashSet
        for (int i = 0; i < n; i++) {
            uniqueSet.add(arr[i]);
        }
        System.out.println(uniqueSet);
    }
}