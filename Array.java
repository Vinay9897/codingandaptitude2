import java.util.HashMap;
import java.util.Iterator;

public class Array {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] nums = { 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int i = 0;
        int count = 0;
        for (i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
                count++;
            } else {
                map.remove(nums[i]);
            }

        }
        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            int key = (int) itr.next();
            System.out.println(key);
        }

    }
}
