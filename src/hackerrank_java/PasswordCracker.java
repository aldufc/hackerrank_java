/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Alexandre Arruda
 */
public class PasswordCracker {
    
    public static String inputString;
    public static String[] patterns;
    public static List<String> listPatterns;
    public static List<String> currentAnswer;
    
    public static Boolean backTrackingSearch(int initialIndex){
        if(initialIndex == inputString.length()){
            return Boolean.TRUE;
        }
        for(String pattern : listPatterns){
            if(inputString.substring(initialIndex).startsWith(pattern)){
                currentAnswer.add(pattern);
                if(backTrackingSearch(initialIndex+pattern.length())){
                    return Boolean.TRUE;
                }
                currentAnswer.remove(currentAnswer.size()-1);
            }
        }
        return Boolean.FALSE;
    }
  
    public static void normalizePatterns(){
        for(String e : patterns){
            listPatterns.add(e);
        }
        Collections.sort(listPatterns);
        Boolean hasChange = true;
        int index = 0;
        while(hasChange){
            hasChange = false;        
            if(index < listPatterns.size() - 1 && Pattern.matches("^(" + listPatterns.get(index) + ")+$", listPatterns.get(index+1))){
                listPatterns.remove(index+1);
                hasChange = true;
            }  
        }
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int nCases = in.nextInt();
        while(nCases-- > 0){          
            in.nextInt();
            in.nextLine();
            
            patterns = in.nextLine().trim().split("\\s+");
            inputString = in.nextLine().trim();
            currentAnswer = new ArrayList<>();
            listPatterns = new ArrayList<>();
            normalizePatterns();
            if(backTrackingSearch(0)){
                System.out.print(currentAnswer.get(0));
                for(int i = 1; i < currentAnswer.size(); i++){
                    System.out.print(" " + currentAnswer.get(i));
                }
                System.out.println("");
            }
            else{
                System.out.println("WRONG PASSWORD");
            }          
        }    
    }
}
