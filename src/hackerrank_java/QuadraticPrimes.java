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
public class QuadraticPrimes {
    private static Boolean isPrime(int number){
        if(number < 2)    
            return Boolean.FALSE;
        if (number == 2 || number == 3)  
            return Boolean.TRUE;
        for(int num = 2; num <= Math.sqrt(number); num++){
            if (number % num == 0)
                return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
    
    private static int numberOfConsecutivePrimesApplyingEquation(int a, int b){
        int counter = 0;
        int resultEquation = equationForPrime(a, b, counter);
        while(isPrime(resultEquation)){
            counter++;
            resultEquation = equationForPrime(a, b, counter);
        }
        return counter;
    }
    
    private static int equationForPrime(int a, int b, int param){
        return param*param + a*param + b;
    }
    
    public static void main(String[] args){
        int maxPrimes = 0, bestA=0, bestB=0, consecutivesPrimes;
        for(int a=-1000; a <= 1000; a++){
            for(int b = -1000; b <= 1000; b++){
                consecutivesPrimes = numberOfConsecutivePrimesApplyingEquation(a,b);
                if (consecutivesPrimes > maxPrimes){
                    maxPrimes = consecutivesPrimes;
                    bestA = a;
                    bestB = b;
                }
            }
        }
        System.out.println(maxPrimes);
        System.out.println(bestA*bestB);
    }
}
