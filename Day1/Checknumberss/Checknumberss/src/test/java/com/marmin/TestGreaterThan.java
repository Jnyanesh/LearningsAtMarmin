package com.marmin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
class TestGreaterThan{
    GreaterThan gt = new GreaterThan();
    
    @Test
    void Test2equal2(){
        Assertions.assertTrue(gt.NumbersCheck(2,2));
    }
    @Test
    void Testneg1andneg2(){
        boolean actual = gt.NumbersCheck(-1,-2);
        boolean expected = false;
        Assertions.assertEquals(actual,expected);
    } 
    @Test
    void Testneg1andneg1(){
        Assertions.assertTrue(gt.NumbersCheck(-1,-1));
    } 
    @Test
    void Testneg55andneg55(){
        Assertions.assertFalse(gt.NumbersCheck(-55,55));
    } 
    @Test
    void Test0andn0decimal(){
        Assertions.assertTrue(gt.NumbersCheck(0,0.00));
    } 
}
