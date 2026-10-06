package com.marmin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class TestDivisibilityCheck {
	DivisibilityCheck divisible = new DivisibilityCheck();
    @Test
	void int12IsDivisibleBy2And3(){
		DivisibilityCheck divisible = new DivisibilityCheck();
		Assertions.assertTrue(divisible.isDivisible(12));
	}
	@Test
	void int24isDivisibleBy2And3(){
		DivisibilityCheck divisible = new DivisibilityCheck();
		Assertions.assertTrue(divisible.isDivisible(24));
	}
	@Test
	void neg24isDivisibleBy2and3(){
		Assertions.assertTrue(divisible.isDivisible(-24));
	}
	@Test
	void deci24isDivisibleBy2and3(){
		Assertions.assertTrue(divisible.isDivisible(24.24));
	}
	@Test
	void int888isDivisibleBy2and3(){
		Assertions.assertTrue(divisible.isDivisible(888));
	}

}
