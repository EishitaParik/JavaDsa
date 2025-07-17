class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int maxFromRight= -1;  //Last element should be -1
        for(int i = n-1;i>= 0;i--){
            int current = arr[i];
            arr[i] = maxFromRight;
            maxFromRight = Math.max(maxFromRight, current);
        }
        return arr;
    }
}