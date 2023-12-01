public class SortMethods {
    int[] array = {5, 97, 23, 56, -18, 2764, 3};

    public int[] bubbleSort(int[] arr) {
        int temp;
        int len = arr.length;

        for (int j = 0; j < len; j++) {
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        return arr;
    }

    public int[] insertionSort(int[] arr) {
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

        return arr;
    }

    public int[] selectionSort(int[] arr) {
        int len = arr.length;
        int min;
        int temp;

        for (int i = 0; i < len; i++) {
            min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

    }
}
