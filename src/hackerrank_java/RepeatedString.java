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
public class RepeatedString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.next();

        int c,d;
        int counter=0;
        for(int i =0; i < input.length()-3; i++){
            for(int j = i+1; j < input.length()-1; j++){
                c = j;
                while(true){
                    c = input.indexOf(input.charAt(j), c+1);
                    if(c == -1)
                        break;
                    d=c;
                    while(true){
                        d = input.indexOf(input.charAt(i),d+1);
                        if(d == -1)
                            break;
                        counter++;                                            
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
