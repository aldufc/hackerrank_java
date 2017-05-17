/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_java;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alexandre Arruda
 */
public class TheCoinChangeProblem {

    public static void main(String[] args){       
        //we have values from 0...250
        long[] change = new long[251];
        Arrays.fill(change,0);
        //we can have at most 50 coins
        int[] coins = new int[50];
        //N provided by user ( N <=250) and M being the amount of coins
        int N,M;
        
        //Scanner for starting input of data
        Scanner in = new Scanner(System.in);
        
        //reading value for N and M
        N = in.nextInt();
        M = in.nextInt();
        
        //taking all coins values
        for (int i = 0; i < M; i++) {
            coins[i] = in.nextInt();            
        }
        change[0]=1;
        //let's use dynamic programming!
        for (int i = 0; i < M; i++) {
            for (int j = coins[i]; j < N+1; j++) {
                change[j] += change[j-coins[i]];                
            }            
        }
        System.out.println(change[N]);
    }  
    
}
