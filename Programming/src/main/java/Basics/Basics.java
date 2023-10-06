package main.java.Basics;

// BigInteger class

// Libraries such as binarySearch and parallelSort - read and use when req

// use final variables as much as possible - sensible var names

// dont make all methods public, only the necessary ones

// make the code debuggable

// can use JUnit for testcases

import main.java.Basics.InputReader;

import java.io.IOException;
import java.util.Arrays;

public class Basics {

    public static void main(String args[]) throws IOException{

        final InputReader reader = new InputReader(System.in);
        final int n = reader.readInt(), a[] = new int[n];

        for(int i=0; i<n; i++){
            a[i] = reader.readInt();
        }

        //for min or max values, better to use
//        Arrays.stream(a).parallel().min()
//        Arrays.stream(a).parallel().max()
//      Here parallel() uses all 4 processors collectively to perform the
//      function and spits out the result
//      can use it incase if a is very big
    }
}