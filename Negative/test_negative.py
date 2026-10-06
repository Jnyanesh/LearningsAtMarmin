from isNegative import isNegative

def test_negative():
	assert isNegative(-2) ==  True
	assert isNegative(0) ==  False
	assert isNegative(-33333) == True
	assert isNegative(33333) == False
	assert isNegative(-3.3) == True
