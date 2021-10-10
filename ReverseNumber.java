public class ReverseNumber {
    public static void main(String[] args) {
        int number = 873729;
        reverseNumber(number);
    }

    private static void reverseNumber(int number) {
        int rem, rev = 0;
        if (number == 0)
            return;
        rem = number % 10;
        rev = (rev * 10) + rem;
        System.out.print(rev + "");
        // p = p * 10;
        reverseNumber(number / 10);

        return;
    }
}
