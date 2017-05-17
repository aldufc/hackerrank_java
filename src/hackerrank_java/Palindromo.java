/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_java;

/**
 *
 * @author Alexandre Arruda
 */
public class Palindromo {
    public static void main(String[] args){
        int a=0;
        for (int i = 0; i < 1000000; i++) {
            for (int j = i+1; j < 1000000; j++) {
                a++;
                a = a % (1000+7);                
            }
            
        }
        System.out.println(a);
    }
    
}
