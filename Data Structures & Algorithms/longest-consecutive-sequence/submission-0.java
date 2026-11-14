
class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();

        // Step 1: Store all elements
        for (int val : nums) {
            map.put(val, true);
        }

        // Step 2: Identify sequence starting points
        for (int val : nums) {
            if (map.containsKey(val - 1)) {
                map.put(val, false);
            }
        }

        int ml = 0;

        // Step 3: Find the longest consecutive sequence
        for (int val : nums) {
            if (map.get(val)) {
                int tl = 1;
                int tsp = val;

                while (map.containsKey(tsp + tl)) {
                    tl++;
                }

                if (tl > ml) {
                    ml = tl;
                }
            }
        }

        return ml;
    }
}