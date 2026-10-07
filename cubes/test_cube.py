from checkCube import Cube

def testcube3():
    c = Cube(3)
    assert c.cube() == 27

def testcubeneg3():
    c = Cube(-3)
    assert c.cube() == -27

def testcubedec3():
    c = Cube(3.3)
    assert c.cube() == 35.937
    
def testcubenegdec3():
    c = Cube(-3.3)
    assert c.cube() == -35.937

def testcube0():
    c = Cube(0)
    assert c.cube() == 0