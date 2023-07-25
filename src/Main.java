import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 5};

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
