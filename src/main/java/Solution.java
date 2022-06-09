public class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen= s.length();
        int tLen = t.length();
        if (sLen != tLen) {
            return false;
        }
        int[] freq = new int[26];
        for (int idx = 0; idx < sLen; idx++) {
            char s_c = s.charAt(idx);
            char t_c = t.charAt(idx);
            int s_diff = s_c - 'a';
            int t_diff = t_c - 'a';
            freq[s_diff]++;
            freq[t_diff]--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
