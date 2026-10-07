package com.marmin;

import java.util.Arrays;
import java.util.ArrayList;


public class EvaluateGrade 
{
    public ArrayList<String> EvaluateGrades(ArrayList<Integer> Grades){
    ArrayList<String> Result = new ArrayList();
    for(int i : Grades){
        if(i>=75 && i<=100){
            Result.add("Distinction");
        }
        else if(i<75 && i>=40){
            Result.add("Pass");
        }
        else if(i<40 && i>=0){
            Result.add("Fail");
        }
        else{
            Result.add("Invalid");
        }

    }
    
    return Result;
    
}
}
