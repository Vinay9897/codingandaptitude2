public class BubbleSort {

    public void bubbleSort(int arr[], int n) {
        int i, j, temp;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap the elements
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // print the sorted array
        System.out.println("Sorted Array: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        int n;
        int[] arr = { 4, 6, 7, 3, 2, 9, 1, 5 };
        n = arr.length;
        bubble.bubbleSort(arr, n);
    }
}
