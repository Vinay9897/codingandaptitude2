public class FindUpperCharacter {
    public static void main(String[] args) {
        String str = " Kello HiHowareyou";
        char[] str1 = str.toCharArray();
        upper(str1, 0);
    }

    private static void upper(char[] str, int i) {
        if (str[i] > 'A' && str[i] <= 'Z') {
            System.out.println(str[i]);
            return;
        }
        if (str[i] == '\0') {
            System.out.println("no upper letter found");
            return;
        }
        upper(str, i + 1);
    }
}
