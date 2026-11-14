class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] resultantArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int result = 1;

            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    result = result * nums[j];
                }
            }

            resultantArray[i] = result;
        }

        return resultantArray;
    }
}