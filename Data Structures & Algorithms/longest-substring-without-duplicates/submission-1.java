
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int maxlen = 0;
        int left = 0;
        int right = 0;
        int startIdx = 0;

        Set<Character> set = new HashSet<>();

        while (right < n) {

            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);

            if (right - left + 1 > maxlen) {
                maxlen = right - left + 1;
                startIdx = left;
            }

            right++;
        }

        return maxlen;
    }
}