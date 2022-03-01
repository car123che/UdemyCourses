# AssertArrayEquals
This method allows us to compare the size and elements in each position between two arrays, they have to be the
same to pass the test and the test will fail if they are not.

Example of the <b>assertArrayEquals() </b> method
``` java
        assertArrayEquals(array1, array2); //pass
        //array1 expected array to compare
        //array2 test array to compare
    
```
This method will return a green bar when testing if array1 and array2 are equals

## Examples
In the files [Theory.java](test/Theory.java) we have a simple look of how to use the method.

With the files [GraphicUtilities.java](test/GraphicUtilities.java) and [GraphicsUtilitiesTest.java](test/GraphicsUtilitiesTest.java) we have a better example of unit tests, testing the brighten and dim methods. 