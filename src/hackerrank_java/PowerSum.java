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
public class PowerSum {
    public static int qtd = 0;
    public static void counter(int currentSum, int currentNumber,int power, int finalSum){
        if(currentSum == finalSum){
            qtd++;
            return;
        }
        if(currentSum > finalSum)
            return;
        while(currentSum + (int) Math.pow(currentNumber, power) <= finalSum ){
            counter(currentSum + (int) Math.pow(currentNumber, power), currentNumber+1, power, finalSum );
            currentNumber++;
        }         
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int number = in.nextInt();
        int power  = in.nextInt();
        
        counter(0,1,power,number);
        
        System.out.println(qtd);        
    }
}
