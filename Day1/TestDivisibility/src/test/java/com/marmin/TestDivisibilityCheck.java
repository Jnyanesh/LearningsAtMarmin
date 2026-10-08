package com.marmin;

import org.junit.jupiter.api.Test;

import java.beans.Transient;

import org.junit.jupiter.api.Assertions;
import java.util.*;

class TestDivisibilityCheck {
	DivisibilityCheck divisible = new DivisibilityCheck();
	Random rand = new Random();

	
	@Test
	void TestRandomDoubleMultipleOf6isNotDivisibleBy2and3(){
		double random = rand.nextDouble()*6;
		Assertions.assertFalse(divisible.isDivisible(random));
	}

    @Test
	void Testint12IsDivisibleBy2And3(){
		DivisibilityCheck divisible = new DivisibilityCheck();
		Assertions.assertTrue(divisible.isDivisible(12));
	}
	@Test
	void Testint24isDivisibleBy2And3(){
		DivisibilityCheck divisible = new DivisibilityCheck();
		Assertions.assertTrue(divisible.isDivisible(24));
	}
	@Test
	void Testneg24isDivisibleBy2and3(){
		Assertions.assertTrue(divisible.isDivisible(-24));
	}
	@Test
	void Testdeci24isDivisibleBy2and3(){
		Assertions.assertFalse(divisible.isDivisible(24.24));
	}
	@Test
	void Testint888isDivisibleBy2and3(){
		Assertions.assertTrue(divisible.isDivisible(888));
	}

}
