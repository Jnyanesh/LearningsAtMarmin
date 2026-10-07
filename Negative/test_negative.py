from isNegative import isNegative

def test_negative():
	def testneg2():
		assert isNegative(-2) ==  True
  
	def test0():
		assert isNegative(0) ==  False

	def testvague():	
		assert isNegative(-33333) == True
	
	def testlongneg():
		assert isNegative(33333) == False
	
	def testnegdeci():
		assert isNegative(-3.3) == True

	def testposdeci():
		assert isNegative(4.40) == False
