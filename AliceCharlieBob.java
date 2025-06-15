import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int digit=a%10;
            // Your code goes here
            if(a%7==0 && digit%2==0)
            
                System.out.println("Alice");
            
            else if(a%9==0 && digit%2!=0)
                System.out.println("Bob");
            
            else
            System.out.println("Charlie");
        }
        
    }
}
