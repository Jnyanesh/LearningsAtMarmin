package com.marmin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.beans.Transient;
import java.util.*;
import java.lang.Integer;

/**
 * Unit test for simple App.
 */
class TestGreaterThan {
    GreaterThan gt = new GreaterThan();
    Random rand = new Random();
    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;

    @Test
    void TestRandomNegativeIntegerisNotEqualToRandomPositiveInteger() {
        int Random1 = rand.nextInt(min, -1);
        int Random2 = rand.nextInt(0, max);
        Assertions.assertFalse(gt.NumbersCheck(Random1, Random2));

    }

    @Test
    void TestRandomInteger() {
        int random = rand.nextInt();
        Assertions.assertTrue(gt.NumbersCheck(random, random));
    }

    @Test 
    void TestRandomDouble(){
        double random = rand.nextDouble();
        Assertions.assertTrue(gt.NumbersCheck(random, random));
    }

    void TestRandomNegativeDoubleisNotEqualToRandomPositiveDouble() {
        double Random1 = rand.nextDouble(min, -1);
        double Random2 = rand.nextDouble(0, max);
        Assertions.assertFalse(gt.NumbersCheck(Random1, Random2));

    }


    @Test
    void Test2equal2() {
        Assertions.assertTrue(gt.NumbersCheck(2, 2));
    }

    @Test
    void TestNeg1NotEqualToNeg2() {
        boolean actual = gt.NumbersCheck(-1, -2);
        boolean expected = false;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void TestNeg1EqualToNeg1() {
        Assertions.assertTrue(gt.NumbersCheck(-1, -1));
    }

    @Test
    void TestNeg55IsNotEqualTo55() {
        Assertions.assertFalse(gt.NumbersCheck(-55, 55));
    }

    @Test
    void Test0and0decimalareEqual() {
        Assertions.assertTrue(gt.NumbersCheck(0, 0.00));
    }
}
