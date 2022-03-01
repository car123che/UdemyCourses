# BeforeAll & AfterAll
This are two actions of the JUnit library that helps us in our project flow, it allows us set things before and 
after making a test.

## BeforeAll
This action allows us to make the initial setup required for the @Test, like loading the info from a database or
a flat file. The method with this action will always execute before the @Test methods.
Example of the <b>@BeforeAll </b> action
``` java
    @BeforeAll
    public static void setup(){
        System.out.println("First");
    }

```
##  AfterAll
This action allows us to make the final setup required. The method with this action will always execute after the @Test methods.
Example of the <b>@AfterAll </b> action
``` java
    @AfterAll
    public static void teardown(){
        System.out.println("last");
    }
```

## Examples
In the files [Theory.java](test/Theory.java)  we have a simple look of how to use these actions.

With the files [Data.java](test/Data.java) and [DataTest.java](test/DataTest.java) we have a better example of unit tests with these actions, testing the findLargest method. 