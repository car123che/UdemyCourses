# AssertTrue & AssertFalse
This two JUnit test methods help us to evalute if an expression or a boolean return from a method is true or false.

## AssertTrue 
Example of the <b>assertTrue() </b> method
``` java
    assertTrue(expression);
    //expression = expression or boolean to evaluate 
```
This method will return a green bar when testing if the expression is true and a red bar if it is false.

## AssertFalse
Example of the <b>assertTrue() </b> method
``` java
    assertFalse(expression);
    //expression = expression or boolean to evaluate 
```
This method will return a green bar when testing if the expression is false and a red bar if it is true.

## Examples
In the files [assertTrue.java](test/assertTrue.java) and [assertFalse.java](test/assertFalse.java) we have a simple look of how to use these methods.

With the files [StringUtilities.java](test/StringUtilities.java) and [StringUtilitiesTest.java](test/StringUtilitiesTest.java) we have a better example of unit tests, testing the isCapitalized method. 