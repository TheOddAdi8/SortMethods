public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 97, 23, 56, -18, 2764, 3};

        int element;
        int len = arr.length;
        int j;

        for (int i = 0; i < len; i++) {
            element = arr[i];
            j = i;
            while ((j > 0) && (arr[j - 1] > element)) {
                arr[j] = arr[j - 1];
                j -= 1;
            }
            arr[j] = element;
        }

        for (int k = 0; k < len; k++) {
            System.out.print(arr[k] + " ");
        }
    }

}
