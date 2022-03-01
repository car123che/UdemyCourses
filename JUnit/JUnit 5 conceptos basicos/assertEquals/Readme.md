# AssertEquals & AssertNotEquals
This are the first JUnit methos to use, it help us to compare two values, and see it the values are equals or not.
## AssertEquals
Example of the <b>assertEquals() </b> method
``` java
    assertEquals(x,y);
    //x = value to compare
    //y = test value
```
This method will return a green bar when testing if the two values supplied are equals and a red bar if they are not

## AssertNotEquals
Example of the <b>assertNotEquals() </b> method
``` java
    assertNotEquals(x,y);
    //x = value to compare
    //y = test value
```
This method will return a green bar when testing if the two values supplied are not equal and a red bar if they are.

## Examples
In the files [assertEquals.java](test/assertEquals.java) and [assertNotEquals.java](test/assertNotEquals.java) we have a simple look of how to use these methods.

With the files [StringUtilities.java](test/StringUtilities.java) and [StringUtilitiesTest.java](test/StringUtilitiesTest.java) we have a better example of unit tests, using a vowels count method and different test cases of them in the StringUtilitiesTest.java 