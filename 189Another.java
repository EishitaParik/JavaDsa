class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;

        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=nums.length-k;i<nums.length;i++){
            temp.add(nums[i]);   //saving the last k elements to the temp array
        }

        for(int i=nums.length-1;i>=k;i--){    //shift each elements k places towards right
            nums[i]=nums[i-k];
        }

        for(int i=0;i<k;i++){     //put back temp array elements to the original array
            nums[i]=temp.get(i);
        }
    }

}