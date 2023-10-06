package nthFibNumber;// O(2n) - Exponential, as every function calls two other functions.

public class Recursion {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
  
    public static void main(String args[])
    {
        int n = 11;
        System.out.println(fib(n));
    }
}
