// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum=0;
        int a;
        a=n;
        while(n>0){
            int digit = n%10;
            sum = sum + (int) (Math.pow(digit,3));
            n/=10;
        }
        if(sum==n)
        return true;
        else
        return false;
    }
}