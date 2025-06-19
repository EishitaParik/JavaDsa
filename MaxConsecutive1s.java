class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int maxLen=0;
        int zeros=0;

        for(int right =0 ; right < nums.length ; right++){
            if(nums[right] == 0){
            zeros++;   //count zero in current window
        }
        //If more than k zeros, shrink the window from left

        while(zeros > k){
            if ( nums[left] == 0){
                zeros--; //remove zero from window
            }
            left++;
        }

        //update max length of valid window
        maxLen = Math.max(maxLen, right - left + 1);
    }

    return maxLen;
    }
}