import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String s = "cbaeba";
        String p = "abc";
        List<Integer> result = findAnagrams(s, p);
        System.out.println(result);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;

            if (i >= p.length()) {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }

            if (i >= p.length() - 1 && areArraysEqual(pCount, sCount)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }

    private static boolean areArraysEqual(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
