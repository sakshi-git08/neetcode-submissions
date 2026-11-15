class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxlen = 0;
        int freq[] = new int[26];
        int left = 0;
        int maxFreq = 0;
        for (int right = 0; right < n; right++) {
            freq[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);
            if((right-left+1) - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxlen = Math.max(right-left+1, maxlen);
        }
        return maxlen;
    }
}
// public int getMaxFreq(int[] freq) {
//     int max = 0;
//     for (int f : freq) {
//         max = Math.max(f, max);
//     }
//     return max;

