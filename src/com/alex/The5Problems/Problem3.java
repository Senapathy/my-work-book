package com.alex.The5Problems;

import java.math.BigInteger;

/**
 * Problem-3
 * Write a function that computes the list of the first 100 Fibonacci numbers.
 * By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 * As an example, here are the first 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
 * https://blog.svpino.com/2015/05/07/five-programming-problems-every-software-engineer-should-be-able-to-solve-in-less-than-1-hour
 *
 * Created by alex on 6/9/15.
 */
public class Problem3 {
    public static void main(String[] args) {
     BigInteger s=new BigInteger("1");
        BigInteger  f=new BigInteger("0");
        BigInteger  t=new BigInteger("0");
        System.out.println("1-"+f+"\n2-"+s);

        for(int i=3;i<=100;i++){
            t= s.add(f);
            System.out.println(i+"-"+t);
            f=s;
            s=t;
        }

    }

}
