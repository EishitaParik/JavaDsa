class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int ans = -1;
        int min_ele = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
            if (nums[j] > min_ele){
                ans = Math.max(ans, nums[j] - min_ele);
            }
            else{
                 min_ele = nums[j];
            }
            }
        return ans;
    }
}
