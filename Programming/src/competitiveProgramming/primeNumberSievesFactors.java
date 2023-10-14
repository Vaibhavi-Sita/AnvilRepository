//package competitiveProgramming;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class primeNumberSievesFactors {
//
//    public static void main(String args[]) throws IOException
//    {
//        System.out.println(findAllPrimeFactors(100));
//    }
//
//    public static List<Integer> findAllPrimeFactors(final int n)
//    {
//        // touched : contains factors other than itself and 1
//        final boolean[] touched = new boolean[n+1];
//
//        // sqrtOfN: we are not considering the whole range while traversing
//        //          we only require to traverse until sqrtOfN
//        //          anything beyond this would've already been marked/covered
//        //          while taking multiples within the range from 2 to sqrtOfN
//        //          Ex: 100 : 10 * 10 -> we only require to initially traverse
//        //                               until 10
//        final double sqrtOfN = Math.sqrt(n);
//        final List<Integer> primes = new ArrayList<>();
//        final List<Integer> factors = new ArrayList<>();
//        final List<Integer> A = new ArrayList<>();
//
//
//        primes.add(2);
//        for(int i =2 ; i < sqrtOfN; i++){
//            if(!touched[i])
//            {
//                touched[i] = true;
//                primes.add(i);
//                factors.add(i);
//            }
//            for(int j=2*i; j<= n; j = j+i)
//            {
//                touched[j] = true;
//                while (A[j]%i == 0)
//                {
//                    factors.indexOf(j) = i;
//
//                }
//            }
//            }
//    }
//
//}
