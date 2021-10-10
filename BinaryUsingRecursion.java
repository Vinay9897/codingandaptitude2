public class BinaryUsingRecursion {
    // wap to conver the number into binary using recursion
    static int number =4;
 static void binary(int number){
    if(number==0)
        return;
    binary(number/2);
    System.out.print(number%2);

    
 }
 public static void main(String[] args) {
     binary(number);
 }
}
