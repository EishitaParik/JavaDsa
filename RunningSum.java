class Solution {
    public int[] runningSum(int[] nums) {
        /* int result[] = new int[nums.length];
        for(int i = 0; i < nums.length ; i++){
            int ans=0;
            for(int j = 0; j <= i; j++){
                ans+= nums[j];
            }
            result[i]= ans;
        }
        return result;  */

        int ans[]=new int[nums.length];
        ans[0] = nums[0];
        for( int i = 1; i<nums.length ; i++){
            ans[i]= ans[i-1]+nums[i];
        }
        return ans;
}
}

//TWO SOLUTIONS ONE WITH 6% COMPLEXITY AND ONE WITH 100%.