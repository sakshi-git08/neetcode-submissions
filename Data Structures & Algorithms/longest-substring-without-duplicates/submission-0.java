class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        String longest = "";
        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            StringBuilder current = new StringBuilder();
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (set.contains(c))
                    break;
                set.add(c);
                current.append(c);
            }
            if (current.length() > maxlen) {
                maxlen = current.length();
                longest = current.toString();
            }
        }
        return maxlen;
    }
}
