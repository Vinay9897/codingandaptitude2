import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        
        System.out.println("Enter the digits:");
        Scanner sc = new Scanner("System.in");
        int n = 12345;
        sc.close();
        Program3 program3 = new Program3();

        program3.digitToWords(n);
        
    }
    private void digitToWords(int num){
        String[] ones = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven"
        ,"twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] tens={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
        if(num<20){
            System.out.print(" "+ ones[num]+" ");
        }
        else if(num>=20 && num<100){
            System.out.print(" "+tens[num/10]+ " ");
            digitToWords(num%10);
        }
        else if(num>100 && num<1000){
            System.out.print (" "+ones[num/100] + " hundred ");
            digitToWords(num%100);
        }
        else if(num>=1000 && num<10000){
            System.out.print(ones[num/1000]+ " thousand ");
            digitToWords(num%1000);
        }
    
    }
}
