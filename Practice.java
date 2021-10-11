import java.util.Arrays;
import java.util.Map;

public class Practice {
    /*
     * public static void main(String[] args) { // Practice practice = new
     * Practice(); String s = "abcabcbb";
     * System.out.println(lengthOfLongestSubstring(s)); }
     * 
     * public static int lengthOfLongestSubstring(String s) {
     * 
     * int[] pos = new int[255]; int res = 0; int start = 0; int end = 0; int len =
     * 0;
     * 
     * Arrays.fill(pos, -1);
     * 
     * for (int i = 0; i < s.length(); i++) { // check if current character is
     * present in our window if (presentInWindow(s, pos, i, start, end)) { // if
     * present in window
     * 
     * // move window start to next index of where the char was found in window
     * start = pos[s.charAt(i)] + 1; // end to current character end = i; // update
     * window length len = end - start + 1;
     * 
     * // update res res = Math.max(res, len); // update position array
     * pos[s.charAt(i)] = i; System.out.println(s.charAt(i)); } else { // if no,
     * then we need to -
     * 
     * // update position array pos[s.charAt(i)] = i; // move window end only end =
     * i; len++; res = Math.max(res, len); } }
     * 
     * return res; }
     * 
     * public static boolean presentInWindow(String str, int[] pos, int i, int
     * start, int end) { // check if position of previous occurence of character at
     * i falls in our window if (pos[str.charAt(i)] >= start && pos[str.charAt(i)]
     * <= end) { System.out.println(str.charAt(i)); return true; } return false; }
     */
    // public static void main(String[] args) {
    // int l = 0, r = 0, maxLen = 0;
    // Map<Character,Integer> map = new Map<>();
    // String s ="abcabcbb";
    // while(l<r){
    // if(map.containsKey(s.charAt(i)){}
    // }
    // }

}
