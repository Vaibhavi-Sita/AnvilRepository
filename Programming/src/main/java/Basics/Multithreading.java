package main.java.Basics;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

// Multithreading for competitive programming

public class Multithreading {

    public static void main(String args[]) throws IOException
    {
        final InputReader reader = new InputReader(System.in);
        final int testCases = reader.readInt();
        final int[] inputNumber = new int[testCases];
        final Solve solver = new Solve();

        // leveraging multithreading
        final TaskManager taskManager= new TaskManager();
        taskManager.acceptTask(solver::findPrimes);
        taskManager.acceptTask(() ->
                {
                    for (int i = 0; i < testCases; i++){
                        inputNumber[i]= reader.readInt();
                }
        });
        taskManager.completeAllTasks();
        final Boolean[] results = new Boolean[testCases];
        taskManager.cyclicAssignment(testCases, Runtime.getRuntime().availableProcessors(),inputNumber,solver,results);
        taskManager.completeAllTasks();
        System.out.println(Arrays.stream(results).map(isPrime -> isPrime ? "YES" : "NO").collect(Collectors.joining("\n")));
    }
}

class Solve {

    // Test cases = 10^6
    // value  = 1 - 10^6

    // Time comp of algo to find primes: sqrt(n) = 10^3
    // 10^3* 10^3 = 10^9 ---> 10 seconds!!
    // algo with timeout

    // sieve algo
    // algo, if not optimised : O(n * logn)
    // Optimized Time comp = O(n) = 10^6 ---> less than 100th of a sec

    public static final int NUMBER_RANGE = 1000000;
    private int primes[] = new int [78497];

    public void findPrimes(){

        final boolean sieve[] = new boolean[NUMBER_RANGE];
        int count = 0;

        for(int i=3; i<NUMBER_RANGE; i= i+2){
            if(!sieve[i])
            {
                primes[count++] = i;
                for(int j= i*3; j<NUMBER_RANGE; j = j+(i<<1)){
                    sieve[j] = true;
                }
            }
        }
        System.out.println(Arrays.toString(primes));
    }

    public boolean solve(final int val){
        return Arrays.binarySearch(primes, val) >=0;
    }


}
