# Bugfix & Feature Practice
This section will describe the bugfix and feature flows using JUnit for tests.

## Bugfix Process
1. Create a JUnit test that triggers the bug. We want a fail condition ironically, because it help us to find the bug.
2. Fix the bug in the source code.
3. Run your JUnit test again and get a green bar, this indicates the bus is fixed. 
4. Submit the source code and JUnit test to the version control flow tool. 

## New Feature Process (test-driven development)
1. Create an empty method that does nothing. 
2. Write JUnit test(s) that properly exercise the method.
3. Run the Junit test(s). They will fail initially because the source code method has not yet been implemented. 
4. Write and refine de source code method until all of y our JUnit test pass. 
5. Submit the source code to the version control flow tool. 
