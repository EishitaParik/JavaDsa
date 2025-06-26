class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freq[]=new int[101];
        int maxFreq=0;
        int result=0;

        for(int num:nums){
            freq[num]++;
            maxFreq=Math.max(maxFreq, freq[num]);
        }

        for(int count:freq){
            if(count==maxFreq){
                result+=count;
            }

        }

        return result;
        
    }
}