/*
 *  @author
 *  Nidhi Chourasia created on 2018
 *
 */

package com.basic.algorithms;

/*A binary gap within a positive integer N is any maximal
 sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

 For example, given N = 1041 the function should return 5, because N has binary representation 10000010001
 and so its longest binary gap is of length 5.*/

public class BinaryGap {

    public static void main(String[] args) {
        int N = 32;
        solution(N);
    }

    private static void solution(int n) {
        int a,count=0,prevCount=0,head;
        String x="";
        //logiv to find binary of decimal
       /* while (n > 0) {
            a = n % 2;
            x = x + a;
            n = n / 2;
        }*/

        while (n > 0) {
            a = n % 2;
            if(a==1){
                if(prevCount<count){
                    prevCount=count;
                }
                count=0;
            }
            if(a==0){
                count++;
            }
            x = x + a;
            n = n / 2;
        }
        System.out.println(x);
        System.out.println(prevCount);
    }

}
