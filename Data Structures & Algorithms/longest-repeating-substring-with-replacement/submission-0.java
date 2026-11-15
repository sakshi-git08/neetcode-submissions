class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int maxlen = 0;
        for(int i = 0; i < n; i++){
            int freq[] = new int [26];
            for(int j = i; j < n; j++){
                freq[s.charAt(j) - 'A']++;
                int len = j - i + 1;
                int maxFreq = getMaxFreq(freq);
                int changesNeeded = len - maxFreq;
                if(changesNeeded <= k){
                    maxlen = Math.max(maxlen, len);
                }
                
            }
            // return maxlen;
        }
        return maxlen;

    }
    public int getMaxFreq(int []freq){
        int max = 0;
        for(int f : freq){
            max = Math.max(f, max);
        }
        return max;
    }

}
