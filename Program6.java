import java.util.Scanner;

public class Program6{
    // Find a pair of given sum in an array
    // public void findPair(int[] arr, int value){
    //     int len = arr.length;
    //     int count =0;
    //     for(int i=0;i<len;i++){
    //         for(int j =i+1;j<len;j++){
    //        if((arr[i]+arr[j])==value){
    //            System.out.println(arr[i]+",
    //            "+arr[j]);
    //            count+=1;
    //        }

    //     }
    //     }
    //     if(count ==0){
    //         System.out.println("No valid pair found");
    //     }
        
    // }
    public void findPair(int[] arr,int value){
        int len= arr.length;
        

    }
    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); 
          int[] arr = {8,7,2,5,3,1} ;
          System.out.println("Enter the sum you want");
          int data = sc.nextInt();
          Program6 program6 = new Program6();
          program6.findPair(arr, data);
   sc.close();
        }
}