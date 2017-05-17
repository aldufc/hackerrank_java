/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_java;

import java.util.Scanner;

/**
 *
 * @author Alexandre Arruda
 */
public class DivisibleSumPairs {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            int counter=0;

            for(int i=0; i < n; i++){
                a[i] = in.nextInt();
            }
            for(int i=0; i < n-1; i++){
                for (int j = i+1; j < n; j++) {
                    if((a[i]+a[j]) % k == 0){
                        counter++;
                    }                          
                }          
            }
            System.out.println(counter);
    }
    
}
