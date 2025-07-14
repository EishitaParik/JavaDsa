import java.util.*;
public class Main{
    static int power(int a, int n){
        if(n == 0 )
        return 1;
       int partial_ans = power(a, n/2);
       if(n%2 == 0)
          return partial_ans * partial_ans;
          return partial_ans * partial_ans * a;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = sc.nextInt();
       int result = power(a, n);
        System.out.println(a + " raised to the power " + n + " is: " + result);
    }
}