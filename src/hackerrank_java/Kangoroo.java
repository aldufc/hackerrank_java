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
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangoroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite: ");
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        if(v2 == v1){
            if(x1 == x2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else{
            int div = (x1-x2)/(v2-v1);
            if(div >=0 && (v2-v1)*div == (x1-x2))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
