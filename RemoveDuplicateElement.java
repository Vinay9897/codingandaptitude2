public class RemoveDuplicateElement {
    public static void main(String args[]) {
        int[] arr = new int[] { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4 };
        int i;
        int j = 0;
        int count = 0;
        for (i = 1; i < arr.length; i++) {
            if (arr[j] == arr[i]) {
                count += 1;
                arr[j] = arr[i];
                System.out.println(j + " " + arr[j]);
                j += 1;
            }

        }
        // for (i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
    }
}