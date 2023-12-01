public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 97, 23, 56, -18, 2764, 3};

        int len = arr.length;
        int min;
        int temp;
        int runs = 0;
        int swaps = 0;

        for (int i = 0; i < len; i++) {
            min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                runs++;
            }
            if (min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                
                swaps++;
            }
        }
        for (int k = 0; k < len; k++) {
            System.out.print(arr[k] + " ");
        }

        System.out.println("\nRuns: " + runs + "\nSwaps: " + swaps);
    }
}
