from isNegative import isNegative
import sys
import random

int_min = -sys.maxsize-1
int_max = sys.maxsize

def test_negative_2_is_negative():
	assert isNegative(-2) ==  True
  
def test_0_is_not_negative():
	assert isNegative(0) ==  False

def test_random_negative_number_is_negative():	
	assert isNegative(random.randint(int_min, -1)) == True
	
def test_random_positive_number_is_not_negative():
	assert isNegative(random.randint(0,int_max)) == False
	
def test_negative_decimal_of_3_is_negative():
	assert isNegative(-3.3) == True

def test_positive_decimal_of_4_is_not_negative():
	assert isNegative(4.40) == False
