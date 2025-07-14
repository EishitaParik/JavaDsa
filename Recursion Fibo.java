import java.util.*;
public class Main{
    static int fibo(int n){
        if(n == 0 || n == 1 )
            return n;
            int ans = fibo(n-1) + fibo(n-2);
            return ans;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Print a number: ");
        int n= sc.nextInt();
        int result = fibo(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}