from checkCube import cube

def testcube():
    assert cube(3) == 27
    assert cube(-3) == -27
    assert cube(3.3) == 35.937
    assert cube(-3.3) == -35.937
    assert cube(0) == 0