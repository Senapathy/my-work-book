package com.alex.The5Problems;

import java.util.Arrays;

/**
 * Problem -5
 * Write a program that outputs all possibilities to put + or - or nothing between the numbers 1, 2, ..., 9 (in this order) such that the result is always 100.
 * For example: 1 + 2 + 34 – 5 + 67 – 8 + 9 = 100. *
 * https://blog.svpino.com/2015/05/07/five-programming-problems-every-software-engineer-should-be-able-to-solve-in-less-than-1-hour
 *
 * Created by alex on 6/10/15.
 */
public class Problem5 {
    public static void main(String[] args) {
        String x = "1 2 3 4 5 6 7 8 9";
        char[] p = new char[17];
        p = x.toCharArray();
        genPattern(1,p);

    }
    public static void genPattern(int level,char[] p){
        if(level == 9){
            process(p);
        } else {
            char[] temp1 = Arrays.copyOf(p,17);
            char[] temp2 = Arrays.copyOf(p,17);
            temp1[(level-1)*2+1]='+';
            temp2[(level-1)*2+1]='-';
            genPattern(level+1,temp1);
            genPattern(level+1,temp2);
            genPattern(level+1,p);
        }
    }

    public static void process(char[] p){
        int op1=0;
        int op2 = 0;
        int sign = 2;
        int i=0;
        while(i<17 && (!(p[i] =='+' || p[i] == '-'))){
            if(p[i]==' '){
                op1 = op1*10;
                i++;
            } else {
                op1 = op1 + Integer.parseInt(p[i]+"");
                i++;
            }
        }
        for(;i<17;i++){
            if(p[i] == ' '){
                op2 = op2 * 10;
            } else if(p[i]=='+'){
                op1 = op1 + (sign * op2);
                op2=0;
                sign=1;
            } else if(p[i] == '-'){
                op1 = op1 + (sign * op2);
                op2=0;
                sign=-1;
            } else{
                op2 = op2 + Integer.parseInt(p[i]+"");
            }
        }
        if(sign != 2){
            op1 = op1 + (sign * op2);
        }
        if(op1 == 500){
            System.out.println(p);
        }
    }
}

