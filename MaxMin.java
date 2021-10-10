public class MaxMin {
    //Given an array, Find the maximum and minimum element.
    public static void main(String[] args) {
        int[] array = {6,9,12,8,12,16,18};
        int max = 0;
        int min = array[0];
        findMaximumAndMinimum(array,max,min);
    }

    private static void findMaximumAndMinimum(int[] array, int max, int min) {
        int len = array.length;
        for(int i =0 ;i<len;i++){
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min  = array[i];
            }
            
        }
        System.out.println(max + " " + min);
int GCD = 0;
        for(int j = 1;j<=min;j++){
            if(max%j==0 && min%j==0){
                    GCD =j;
            }
            
        }
        System.out.println("GCD of min and max element is :" + GCD);
    }
}
