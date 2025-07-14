/*public class Fibo{
    public static void main(String[] args){
        System.out.println(fibo(7));
   
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
*/
class FibonacciRecursion {
    
    // Recursive function to get nth fibonacci number
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    
    public static void main(String[] args) {
        int n = 10; // print first 10 terms
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}



