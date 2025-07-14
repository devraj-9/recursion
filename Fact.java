/*public class Fact{
    public static void main(String[] args){
        int ans = fact(5);
        System.out.println(ans);

    }

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n * fact(n-1);
    }
}*/


/*public class Sum{
    public static void main(String[] args){
        int ans = sum(5);
        System.out.println(ans);

    }

    static int sum(int n){
        if(n<=1){
            return 1;
        }
        return n * sum(n-1);
    }
}*/

import java.util.Scanner;

public class Fact{
    
    // Recursive function to calculate factorial
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        } else {
            return n * fact(n - 1); // recursive case
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = fact(num);
            System.out.println("Factorial of " + num + " is " + result);
        }
        
        sc.close();
    }
}

