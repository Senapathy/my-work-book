package com.alex.The5Problems;

/**
 * Problem-4
 * Write a function that given a list of non negative integers, arranges them such that they form the largest possible number.
 * For example, given [50, 2, 1, 9], the largest formed number is 95021.
 * https://blog.svpino.com/2015/05/07/five-programming-problems-every-software-engineer-should-be-able-to-solve-in-less-than-1-hour
 *
 * Created by alex on 6/9/15.
 */
public class Problem4 {
    public static void main(String[] args) {

        int j,n,i;
//        int[] nos = {4,7,53,428,50,49,9291,55,9,822,48,47,44821999,89,8};
        int[] nos = {50,5};

        n = nos.length;
        disp(nos);
        System.out.println();

        for ( i=0;i<(n-1);i++)
           for( j=(i+1);j<n;j++)
               if(isLarge(nos[i], nos[j])){
                   int tmp = nos[i];
                   nos[i] = nos[j];
                   nos[j]=tmp;
               }

        disp(nos);
        System.out.println();
        disp2(nos);
    }
    public static boolean isLarge(int l1,int l2){
        String s1= l1 +"";
        String s2=l2+"";
        int i=0;
        int j=0;
        while(j<s2.length() && i<s1.length()){
              if(s1.charAt(i) < s2.charAt(j)){
                    return true;
              } else if(s1.charAt(i) > s2.charAt(j))
                  return false;
            i=i+1;
            j=j+1;
        }
        while(i<s1.length()){
            if(s1.charAt(i) == s2.charAt(j-1))
                i++;
            else if(s1.charAt(i) < s2.charAt(j-1))
                return true;
            else
                return false;
        }
        while(j<s2.length()){
            if(s1.charAt(i-1) == s2.charAt(j))
                j++;
            else if(s1.charAt(i-1) < s2.charAt(j))
                return true;
            else
                return false;
        }
        return false;
    }

    //Simple comparator
    public static boolean isLarge2(int l1,int l2){
        String tmp = l1+""+l2;
        if(tmp.compareToIgnoreCase(l2+""+l1) > 0)
            return false;
        return true;
    }

    public static void disp(int[] nos){
        for(int i=0;i<nos.length;i++){
            System.out.print(nos[i] +" ");
        }
    }
    public static void disp2(int[] nos){
        for(int i=0;i<nos.length;i++){
            System.out.print(nos[i] );
        }
    }
}
