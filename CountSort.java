public class CountSort {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 5, 3, 6, 2, 8, 9, 1, 0 };
        int range = max(arr);
        int[] arr1 = countSort(arr, range);
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println("Sorted Array");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr1[i] + " ");
        }
    }

    // for finding the range
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // countSort() function

    public static int[] countSort(int[] arr, int range) {
        int[] count = new int[range + 1];
        for (int i = 0; i <= range; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Another array for storing the sort elements

        int[] sort = new int[arr.length];
        int k = 0;
        for (int i = 0; i <= range; i++) {
            for (int j = 0; j < count[i]; j++) {
                sort[k++] = i;
            }
        }
        return sort;
    }
}
