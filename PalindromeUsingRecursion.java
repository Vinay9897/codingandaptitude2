public class PalindromeUsingRecursion {

    public static void main(String[] args) {
       int n = 123;
       
       int flag = checkPalindrome(n);
       if(flag==1){
            System.out.println("palindrome");
       }
       else{
           System.out.println("non palindrome");
       }
    
    }

    private static int checkPalindrome(int n) {
        int flag = 0;
        int n1=n;
        int r2;
        int r1,rev_sum=0;
        if(n ==0)return 0;
        r1 = n%10;
        rev_sum  = rev_sum*10 + r1;
             checkPalindrome(n/10);
             r2 = n1%10;
             n1 = n1/10; 
             if(r1 == r2){
                flag =1;
             }
             else{
                 flag= 0;
             }

            return flag;
       
    }
}
