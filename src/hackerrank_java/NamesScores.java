/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alexandre Arruda
 */

public class NamesScores {
    private String inputString;
    private List<String> nameList;
    
    
    private String[] getSplitNamesFromInputString(){
        return inputString.split(",");
    }
    
    private void sortNamesInList(){
        Collections.sort(nameList);
    }

    private void loadNamesFromInput(){
        addNamesToNameList(getSplitNamesFromInputString());
    }
    
    private void addNamesToNameList(String[] individualNames){
        for(String individualName : individualNames)
            nameList.add(individualName);        
    }
        
    private void initializeList(){
        this.nameList = new ArrayList<>();
    }
    
    public String getInputString(){
        return this.inputString;
    }
    
    public void setInputString(String input){
        this.inputString = input;
    }

    public NamesScores(String input){
        setInputString(input);
        initializeList();
        loadNamesFromInput();
        sortNamesInList();
    }

    public int getNameScoreFromString(String name){
        int totalScore = 0;
        for(int caracterIndex =0; caracterIndex < name.length(); caracterIndex++)
            totalScore += name.charAt(caracterIndex) - 64;
        return totalScore;
    }

    public int getNameScoreFromIndex(int index){
        return getNameScoreFromString(getNameList().get(index));
    }
    
    public int getTotalScoreFromIndex(int index){
        return getNameScoreFromIndex(index)*(index+1);
        
    }
    public List<String> getNameList() {
        return nameList;
    }
       
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.next();
        input = input.replace("\"", "");
        
        NamesScores names = new NamesScores(input);
        long totalSum = 0;
        for(int index = 0;  index < names.getNameList().size(); index++)
            totalSum += names.getTotalScoreFromIndex(index);
        System.out.println(totalSum);
    }
}
