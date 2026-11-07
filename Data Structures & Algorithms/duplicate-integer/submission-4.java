class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hset = new HashSet<>();
        boolean flag = false;
        for(int element:nums){
            if(hset.contains(element)){
                return true;
            }
            hset.add(element);

        }
        return flag;
    }
}