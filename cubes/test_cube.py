from checkCube import Cube
import sys, random

int_max = sys.maxsize
int_min = -sys.maxsize-1
random_number = random.randint(int_min,int_max)


def test_integer_max_value_cube():
    c = Cube(int_max)
    assert c.cube() == int_max ** 3
    
def test_integer_min_value_cube():
    c = Cube(int_min)
    assert c.cube() == int_min ** 3
    
def test_random_number_cube():
    c = Cube(random_number)
    assert c.cube() == random_number ** 3
    
def test_cube_of_3():
    c = Cube(3)
    assert c.cube() == 27

def test_cube_of_negative_3():
    c = Cube(-3)
    assert c.cube() == -27

def test_cube_of_decimal_3():
    c = Cube(3.3)
    assert c.cube() == 35.937
    
def test_cube_negative_and_decimal_3():
    c = Cube(-3.3)
    assert c.cube() == -35.937

def test_cube_of_0():
    c = Cube(0)
    assert c.cube() == 0