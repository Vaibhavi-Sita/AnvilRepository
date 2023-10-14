package competitiveProgramming;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class primeNumberSieves {

    public static void main(String args[]) throws IOException
    {
        System.out.println(findAllPrimesUpto(100));
    }

    public static List<Integer> findAllPrimesUpto(final int n)
    {
        // touched : contains factors other than itself and 1
        final boolean[] touched = new boolean[n+1];

        // sqrtOfN: we are not considering the whole range while traversing
        //          we only require to traverse until sqrtOfN
        //          anything beyond this would've already been marked/covered
        //          while taking multiples within the range from 2 to sqrtOfN
        //          Ex: 100 : 10 * 10 -> we only require to initially traverse
        //                               until 10
        final double sqrtOfN = Math.sqrt(n);
        final List<Integer> primes = new ArrayList<>();

        primes.add(2);

        // this case covers all the even numbers
        // i.e multiples of 2 will be marked as touched
        for(int i = 2; i < n; i+=2)
        {
            // all even numbers other than 2 are not prime
            touched[i] = true;
        }

        // starting from 3, and until it is sqrtOfN
        // i+=2 -> skips all multiples of 2 i.e takes odd nos
        for( int i=3; i<sqrtOfN; i+=2)
        {
            // if the number is not already touched
            if(!touched[i])
            {
                // we take the number's square : j
                // and its multiples : j + (i*2)
                // and mark it as touched
                for(int j=i*i ; j<=n; j = j+(i*2))
                {
                    touched[j] = true;
                }
            }
        }

        // sieve through the number range and filter out the untouched
        // add it to the primes list
        for(int i=2; i<=n; i++)
        {
            if(!touched[i])
            {
                primes.add(i);
            }
        }
        return primes;
    }
}
