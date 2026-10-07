package com.marmin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import java.util.Arrays;


class TestEvenPositive
{
    EvenPositive evn = new EvenPositive();
    @Test
    void TestArrayOfPositiveEvens(){
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(2,4,6,8));
        ArrayList <Boolean> Actual = evn.CheckPositive(nums);
        ArrayList <Boolean> Expected = new ArrayList<>(Arrays.asList(true,true,true,true));

        Assertions.assertEquals(Actual,Expected);
    }

    @Test
    void TestArrayOfPositiveOdds(){
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(3,3,5,5));
        ArrayList <Boolean> Actual = evn.CheckPositive(nums);
        ArrayList <Boolean> Expected =  new ArrayList<>(Arrays.asList(false,false,false,false));

        Assertions.assertEquals(Actual,Expected);
    }

    @Test
    void TestArrayOfNegativeEvens(){
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(-2,4,6,-8));
        ArrayList <Boolean> Actual = evn.CheckPositive(nums);
        ArrayList <Boolean> Expected = new ArrayList<>(Arrays.asList(false,true,true,false));
        Assertions.assertEquals(Actual,Expected);
    }

    @Test
    void TestArrayOfNegativeOdds(){
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(-3,4,-7,8));
        ArrayList <Boolean> Actual = evn.CheckPositive(nums);
        ArrayList <Boolean> Expected = new ArrayList<>(Arrays.asList(false,true,false,true));

        Assertions.assertEquals(Actual,Expected);
    }

    @Test
    void TestArrayOfZeros(){
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(2,0,0,8));
        ArrayList <Boolean> Actual = evn.CheckPositive(nums);
        ArrayList <Boolean> Expected = new ArrayList<>(Arrays.asList(true,false,false,true));

        Assertions.assertEquals(Actual,Expected);
    }

    
}
