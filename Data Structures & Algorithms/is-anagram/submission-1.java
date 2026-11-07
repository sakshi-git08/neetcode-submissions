class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            map1.put(sChar, map1.getOrDefault(sChar, 0) + 1);
            map2.put(tChar, map2.getOrDefault(tChar, 0) + 1);
        }

        return map1.equals(map2);
    }
}
