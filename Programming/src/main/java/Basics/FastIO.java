package main.java.Basics;// usually io ops take a very long time

// to reduce the time / avoid them

// reduce the no of operations

import java.io.IOException;
import java.io.InputStream;

public class FastIO {

    private InputStream stream;
    private byte[] buf = new byte[1024];

    private int curChar;

    private int numChars;

    public FastIO(InputStream stream) {
        this.stream = stream;
    }

    public int read() {
        if (numChars == -1)
            throw new RuntimeException();
        if (curChar >= numChars) {
            curChar = 0;
            try {
                numChars = stream.read(buf);
            } catch (IOException e) {
                throw new RuntimeException();
            }
            if (numChars <= 0)
                return -1;
        }
        return buf[curChar++];
    }

    public String readString() {
        final StringBuilder stringBuilder = new StringBuilder();
        int c = read();
        while (ignoredCharacter(c))
            c = read();
        do {
            stringBuilder.append(c);
            c = read();
        } while (!ignoredCharacter(c));
        return stringBuilder.toString();
    }

    public int readInt() {
        int c = read();
        while (ignoredCharacter(c))
            c = read();
        int sgn = 1;
        // for negative integers
        if (c == '-') {
            // set sign -ve
            sgn = -1;
            c = read();
        }
        int res = 0;

        // Example:
        // -->| 1478
        // res = 1
        // res = 10 + 4 = 14
        // res = 140 + 7 = 147
        // res = 1470 + 8 = 1478
        do {
            if(c <'0' || c>'9') throw new RuntimeException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!ignoredCharacter(c));
        // final result is num multiplied by sign
        return res * sgn;
    }

    public long readLong() {
        int c = read();
        while (ignoredCharacter(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        long res = 0;
        do {
            res *= 10;
            res += c - '0';
            c = read();
        } while (!ignoredCharacter(c));
        return res * sgn;
    }

    public byte readByte(){
        int c = read();
        while (ignoredCharacter(c))
            c = read();
        int sgn = 1;
        if (c == '-') {
            sgn = -1;
            c = read();
        }
        byte res = 0;
        do {
            if(c <'0' || c>'9') throw new RuntimeException();
            res *= 10;
            res += c - '0';
            c = read();
        } while (!ignoredCharacter(c));
        return (byte)(res * sgn);
    }

    public boolean ignoredCharacter(int c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1 || c==',';
    }
    public static void main(String args[]) throws IOException, InterruptedException {

        final InputReader ip = new InputReader(System.in);
        // Printing out test cases:
        /*
        for(int testcases = br.readInt(); testcases>0; testcases--){
            System.out.println("answer");
        }
        */

        // Do this instead :
        // define a string and take every testcase and append it to a string

        /*
        String s = "";
        for(int testcases = br.readInt(); testcases>0; testcases--){

            //computations
            //evaluate s
            s += "answer";
        }
        System.out.println(s);
         */

        // But problem arises because in Java, strings are immutable

        // everytime we are saying "+=" - it is creating a new string
        // not efficient

        // There are two ways around this,
        // 1. StringBuffer
        // note: it is concurrency-safe. but arent really bothered about it rn

        //    StringBuffer sb = new StringBuffer();

        // what we need is the fastest string appender possible
        // For that we have
        // 2. StringBuilder

        StringBuilder sb = new StringBuilder();
        for(int testcases = ip.readInt(); testcases>0; testcases--){
            sb.append("answer");
        }
    }

}
