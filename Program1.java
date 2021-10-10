import java.util.Scanner;

 
public class Program1{
    // wap to print the 

    // int findPower(int a,int b ){
    //     int temp = findPower(a,b/2);
    //     if( b == 0){
    //         return 1;
    //        if(b%2==0){
    //            return temp*temp;
    //        }
    //        else{
    //            return a*temp*temp;
    //        }
    //     }
    //     return ;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the x and y:");
        int x = sc.nextInt() ;
        int  y = sc.nextInt();
        int y1  = y; 
        sc.close();
        int power =1;
    //    while(y!=0){
    //      power *= x ;
    //         y-=1;
    //    }
        Program1 pg1 = new Program1();
        
        
       // System.out.println(pg1.findPower(x,y));
    }
    
}