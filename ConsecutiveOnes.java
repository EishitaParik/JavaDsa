class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int Currcount=0;
        int Maxcount=0;
        for(int i : nums)
        {
            if(i==1){
                Currcount++;
                Maxcount = Math.max(Maxcount, Currcount);
            }
            else {
                
                Currcount=0;
            }
        }
        return Maxcount;
    }
}