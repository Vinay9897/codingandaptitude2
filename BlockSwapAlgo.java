public class BlockSwapAlgo {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int len = arr.length;
        int r = 3;
        arr = leftRotate(arr, r, len);
        printArrayAfterRotation(arr, len);
    }

    public static void printArrayAfterRotation(int[] arr, int len) {
        for (int k = 0; k < len; k++) {
            System.out.println(" " + arr[k]);
        }
        System.out.println("\r\n");
    }

    public static int[] leftRotate(int[] arr, int r, int n) {
        r %= n;
        int A = r;
        int B = n - r;
        if (r == 0 || r == n) {
            return arr;
        }
        while (A != B) {
            if (A < B) {
                swap(arr, r - A, r - A + B, A);
                B = B - A;
            } else {
                swap(arr, r - A, r, B);
                A = A - B;
            }
        }
        swap(arr, r - A, r, A);
        return arr;
    }

    public static void swap(int[] arr, int aIndex, int bIndex, int r) {
        int temp;
        for (int i = 0; i < r; i++) {
            temp = arr[aIndex + i];
            arr[aIndex + i] = arr[bIndex + i];
            arr[bIndex + i] = temp;
        }
    }

}
