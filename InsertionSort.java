public class InsertionSort {

    public void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 5, 8, 2, 9 };
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
    }

}
