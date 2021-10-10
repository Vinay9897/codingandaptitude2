import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] milestones = new int[3];
System.out.println("Enter the 3 values");
        for (int i = 0; i < 3; i++) {
            milestones[i] = sc.nextInt();
        }

        sc.close();
        Program4 program4 = new Program4();
        System.out.println(program4.noOfWeeks(milestones));
    }

    public int noOfWeeks(int[] milestones) {
        int len = milestones.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += milestones[i];
        }
        if(sum>7){
            sum = 7;
        }
        return sum;
    }

}
