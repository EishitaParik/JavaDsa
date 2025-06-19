// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int maxSum=0;
        int sum=0;
        for(int i=0; i< k; i++){
            sum+= arr[i];
        }
        maxSum = sum;
           for(int i = k; i< arr.length ;i++){
               sum = sum - arr[i-k] + arr[i];
               maxSum= Math.max(maxSum, sum);
            }
        return maxSum;
    }
}