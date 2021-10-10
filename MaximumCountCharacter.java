import java.util.Scanner;

public class MaximumCountCharacter {
    public void findMaximumOccuringCharacter(String str) {
        char[] character = str.toCharArray();
        int len = character.length;
        int[] count = new int[123];
        int max = 0;
        char c1 = ' ';
        for (int i = 0; i < len; i++) {

            for (int j = 0; j < len; j++) {
                if (character[i] == character[j]) {
                    count[character[i]]++;
                }
            }

        }
        for (int k = 0; k < 123; k++) {
            if (count[k] != 0 && max < count[k]) {
                max = count[k];
                c1 = (char) k;
            }
            System.out.print(c1 + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "aaaaabbbbbcd";
        sc.close();
        MaximumCountCharacter program5 = new MaximumCountCharacter();
        program5.findMaximumOccuringCharacter(s);
    }
}
