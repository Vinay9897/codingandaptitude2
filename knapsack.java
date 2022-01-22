import java.util.Arrays;
import java.util.Scanner;

public class knapsack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		// profit
		System.out.println("Enter the Profit values");
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		// weight
		System.out.println("Enter the Weight values");
		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
		}

		// capacity

		System.out.println("Enter the capacity:");
		int capacity = sc.nextInt();

		Item[] items = new Item[n];
		for (int i = 0; i < n; i++) {
			double r = p[i] * p[i] / w[i];
			Item item = new Item(p[i], w[i], r);
		}

		// Now sort the array on the basis of ratio ->r

		Arrays.sort(items);

		double v = 0;
		int rc = capacity;
		for (int i = n - 1; i >= 0; i--) {
			if (rc == 0)
				break;
			if (items[i].wt <= rc) {
				v += items[i].val;
				rc += items[i].wt;
			} else {
				v += items[i].val * ((double) rc / items[i].wt);
				rc = 0;
				break;
			}
		}
		System.out.println(v);
	}

	public static class Item implements Comparable<Item> {
		int val;
		int wt;
		double r;

		Item(int val, int wt, double r) {
			this.val = val;
			this.wt = wt;
			this.r = r;
		}

		@Override
		public int compareTo(Item o) {

			return (int) (this.r = o.r);
		}
	}

}
