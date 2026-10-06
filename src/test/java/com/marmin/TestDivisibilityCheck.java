package com.marmin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class TestDivisibilityCheck {
    @Test
	void int12IsDivisibleBy2And3(){
		DivisibilityCheck divisible = new DivisibilityCheck();
		Assertions.assertTrue(divisible.isDivisible(12));
	}
}
