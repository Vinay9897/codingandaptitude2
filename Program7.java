public class Program7 {
   // print the even numbers at odd position and vice-versa using recursion.
   private static int n=1;
static void odd(){
        
        if(n<=10){
            System.out.print((n+1)+" ");
            n+=1;
            even();
        }
        
    }
    static void even(){
          if(n<=10){
              System.out.print((n-1)+ " ");
              n+=1;
              odd();
          }  
    }
    public static void main(String[] args) {
        odd();
       
        
    }
}
