package com.alex.The5Problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Problem 2
 * Write a function that combines two lists by alternatingly taking elements.
 * For example: given the two lists [a, b, c] and [1, 2, 3], the function should return [a, 1, b, 2, c, 3].
 * https://blog.svpino.com/2015/05/07/five-programming-problems-every-software-engineer-should-be-able-to-solve-in-less-than-1-hour
 *
 * Created by alex on 6/9/15.
 */
public class Problem2 {
    public static void main(String[] args) {
        List<Integer> x = new ArrayList<Integer>();
        x.add(10);
        x.add(10);
        x.add(10);
        x.add(10);

        List<Integer> a = new ArrayList<Integer>();
        a.add(20);
        a.add(20);
        a.add(20);
        a.add(20);
        a.add(20);
        a.add(20);

        List<Integer> l = mix(x,a);
        System.out.println(l);
    }

    public static List<Integer> mix(List<Integer> l1,List<Integer> l2 ){
        List<Integer> l = new ArrayList<>();
        Iterator<Integer> i1 = l1.iterator();
        Iterator<Integer> i2 = l2.iterator();
        while(i1.hasNext() && i2.hasNext()){
            l.add(i1.next());
            l.add(i2.next());
        }

        while(i1.hasNext()){
            l.add(i1.next());
        }
        while( i2.hasNext()){
            l.add(i2.next());
        }
        return l;
    }
}
