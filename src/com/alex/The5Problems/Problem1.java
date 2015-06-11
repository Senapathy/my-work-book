package com.alex.The5Problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem-1
 * Write three functions that compute the sum of the numbers in a given list using a for-loop, a while-loop, and recursion.
 * https://blog.svpino.com/2015/05/07/five-programming-problems-every-software-engineer-should-be-able-to-solve-in-less-than-1-hour
 *
 * Created by alex on 6/9/15.
 */
public class Problem1 {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<Integer>();
        x.add(10);
        x.add(10);
        x.add(10);
        x.add(10);

        System.out.println(sumFor(x));
    }
    public static int sumWhile(List<Integer> nos){
        java.util.ListIterator<Integer> itr = nos.listIterator();
        int sum = 0;
        while (itr.hasNext()){
            Integer item = itr.next();
            sum = sum + item;
        }
        return sum;
    }
    public static int sumFor(List<Integer> nos){
        java.util.ListIterator<Integer> itr = nos.listIterator();
        int sum = 0;
        for(;itr.hasNext();){
            Integer item = itr.next();
            sum = sum + item;
        }
        return sum;
    }

    public static int sumR(List<Integer> lst){
        java.util.ListIterator<Integer> itr = lst.listIterator();
        if(itr.hasNext()){

                Integer item = itr.next();
                lst.remove(item);
                return item+ sumR(lst);

        }
        return 0;
    }
}
