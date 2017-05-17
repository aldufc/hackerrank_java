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
public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int counter =1;
        for(int i =1; i < s.length(); i++){
            if ( Character.isUpperCase(s.charAt(i))) counter++;
        }
        System.out.println(counter);
    }
    
}
