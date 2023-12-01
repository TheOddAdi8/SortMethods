import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 9};
        
        int temp;
        int len = arr.length;

        /*
        for (int j = 0; j < len; j++) {
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        */
        
        Arrays.sort(arr);

        for (int k = 0; k < len; k++) {
            System.out.println(arr[k]);
        } 
    }
}
