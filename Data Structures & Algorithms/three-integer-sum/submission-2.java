class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3)
            return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int li = i + 1;
            int ri = nums.length - 1;
            while (li < ri) {
                int sum = nums[i] + nums[li] + nums[ri];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[li], nums[ri]));
                    li++;
                    ri--;
                } else if (sum < 0) {
                    li++;
                } else {
                    ri--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
