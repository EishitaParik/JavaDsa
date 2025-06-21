class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int temp[]=new int[n]; //new array to store the rotated values

        k=k%n;

        for(int i=0;i<n;i++){  
            temp[(i+k)%n]=nums[i];   //calculates new index of each element (i+k)%n
        }
        for(int i=0;i<n;i++){   //copy all the values back to original array
            nums[i]=temp[i];
        }
    }
}