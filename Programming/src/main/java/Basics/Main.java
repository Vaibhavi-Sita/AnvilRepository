package main.java.Basics;

import java.io.IOException;


public class Main {

    public static void main(String args[]) throws IOException, InterruptedException {
        final Solver solver = new Solver();
        System.out.println(new FastIO(System.in).readInt());
        System.out.println(solver.solve());
    }
}

class Solver {
    public String solve(){
        return "";
    }
}