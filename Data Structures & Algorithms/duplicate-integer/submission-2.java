class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> table = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            if (table.containsKey(nums[i])) {
                return true;
            }
            table.put(nums[i], i);
        }
        return false;
    }
}