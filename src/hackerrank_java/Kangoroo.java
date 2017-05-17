/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_java;

/**
 *
 * @author Alexandre Arruda
 */import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangoroo {

    public static void main(String[] args) {
        int x1,v1,x2,v2;
        Scanner in = new Scanner(System.in);
        x1 = in.nextInt();
        v1 = in.nextInt();
        x2 = in.nextInt();
        v2 = in.nextInt();
        
        if(v2 == v1){
            if(x1 == x2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        else{
            if((x1-x2) % (v2-v1) == 0 && (x1-x2)/(v2-v1) >= 0 )
               System.out.println("YES");
            else
              System.out.println("NO");

        }
    }
}