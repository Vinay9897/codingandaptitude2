public class Problem1 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(print(n));
    }

    private static int print(int n) {
        int x = 0;
        if (n == 0) {
            return 0;
        }
        System.out.println(n);
        x = n + x;
        print(n - 1);
        return x;

    }
}
