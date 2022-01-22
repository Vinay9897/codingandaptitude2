public class QuickSort {

    public static void main(String[] args) {
        int i;
        int arr[] = { 90, 23, 101, 45, 65, 28, 67, 89, 34, 29 };
        QuickSort qS =new QuickSort();
        qS.quickSort(arr, 0, 9);

        System.out.println("\n The sorted array is: \n");
        for (i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    int partition(int a[], int beg, int end) {
        int left, right, temp, pivot, flag;
        pivot = left = beg;
        right = end;
        flag = 0;
        while (flag != 1) {
            while ((a[pivot] <= a[right]) && (pivot != right))
                right--;
            if (pivot == right)
                flag = 1;
            else if (a[pivot] > a[right]) {
                temp = a[pivot];
                a[pivot] = a[right];
                a[right] = temp;
                pivot = right;
            }
            if (flag != 1) {
                while ((a[pivot] >= a[left]) && (pivot != left))
                    left++;
                if (pivot == left)
                    flag = 1;
                else if (a[pivot] < a[left]) {
                    temp = a[pivot];
                    a[pivot] = a[left];
                    a[left] = temp;
                    pivot = left;
                }
            }
        }
        return pivot;
    }


    public void quickSort(int a[], int beg, int end)  
    {  
        int pivot;  
        if(beg<end)  
        {  
            pivot = partition(a, beg, end);  
            quickSort(a, beg, pivot-1);  
            quickSort(a, pivot+1, end);  
        }  
    }
}