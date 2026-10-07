package com.marmin;

import org.junit.jupiter.api.Test;

import java.beans.Transient;

import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import java.util.Arrays;


class TestGradeEvaluation
{
    EvaluateGrade eval = new EvaluateGrade();
    @Test
    void TestNormalGrades(){
        ArrayList<Integer> grade = new ArrayList<>(Arrays.asList(12,45,99,100));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Fail","Pass","Distinction","Distinction"));
        ArrayList<String> actual = eval.EvaluateGrades(grade);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void TestBoundaryValues(){
        ArrayList<Integer> grade = new ArrayList<>(Arrays.asList(39,74,99,0,40,75));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Fail","Pass","Distinction","Fail","Pass","Distinction"));
        ArrayList<String> actual = eval.EvaluateGrades(grade);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void TestUnusualValues(){
        ArrayList<Integer> grade = new ArrayList<>(Arrays.asList(-1,1001,95,12,77,-999));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Invalid","Invalid","Distinction","Fail","Distinction","Invalid"));
        ArrayList<String> actual = eval.EvaluateGrades(grade);

        Assertions.assertEquals(expected,actual);
    }
    
    @Test
    void TestInvalidsValues(){
        ArrayList<Integer> grade = new ArrayList<>(Arrays.asList(-15,10501,1213,-999));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Invalid","Invalid","Invalid","Invalid"));
        ArrayList<String> actual = eval.EvaluateGrades(grade);

        Assertions.assertEquals(expected,actual);
    }
}
