class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       int[] freq = new int[2001];
       for(int i=0;i<arr.length;i++){
        int number=arr[i];
        freq[number+1000]++;
        }

        boolean[] seen = new boolean[arr.length+1];

        for(int i=0;i<freq.length;i++){
            int count = freq[i];
            if(count>0){
                if(seen[count]==true){
                    return false;
                }
                seen[count]=true;
            }
        }
        return true;
    }
}