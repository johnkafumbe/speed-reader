# Speed Reader

## About

_(TODO: insert a description of the project here!)_

### Authors

*   Carrie Anne Little 
*   John Kafumbe

### Resources

*   
*   ...
*   `DrawingPanel.java` adapted from _[Building Java Programs](https://www.buildingjavaprograms.com/) by Reges and Stepp.

## Write-up

### Semantic Mysteries

#### Problem 1.1

- First change modifies a local variable x which is a primative type
- Second change modifies the x field in Cell c -- by reference
- Third change modifies the x field in Cell c then points c to a new Cell where the x field is 0  -- by reference

#### Problem 1.2

- Counter1 increments value by 1
- Counter2 doubles value, a local variable that is then lost because the change made to it exists only within the increment function
- Counter3 increments the value field in Counter3 class by some amount value
- Counter4 increments some value by the value field stored in class Counter4

#### Problem 1.3

- If a member is marked as static then every new object of that class will have that same member, both in value and in will point to it in memory. 

- This code does not work because it is a non-static function, which cannot take a static variable. It can be fixed by making increment static.

- Don't do it? This code does not work because printGreeting is a method, which needs to reference something which it is currently not doing. 


#### Problem 1.4

- The == doesn't check if any two variables are the same it just checks if they are at the same memory location. Since c1 and c2 are objects of the Counter class they are not variables and are at different memory locations. To fix it we call c1.value == c2.value.

- We expect the code to return as false, it returns true. This is beacuse to save memory java will store identical values of the same type at the same memory location (basically creating a duplicate pointer). This works for numbers and string, literals, probably some specific forms of arrays. == does not compare the actual contents of the variables just the memory. 

- s3 == s4 returns false because the strings stored at each variable, while the same, are being held in different memory locations beacuse the two string are not string literals. 

#### Problem 2.1

(always: ✓, sometimes: ?, never: ✗)

*   Point A:
    + `x1 == 0`: ?
    + `x2 < 0`: ?
*   Point B:
    + `x1 == 0`: ?
    + `x2 < 0`: ✗
*   Point C:
    + `y1 < 5`: ?
    + `y2 > 0`: ?
*   Point D:
    + `z > y1`: ?
    + `z < 0`: ✗

#### Problem 2.2

(always: ✓, sometimes: ?, never: ✗)

|         | `s.length >= 2` | `ret.length() > 0` | `ret.length() % 2 == 0`
| ------- | --------------- | ------------------ | -----------------------
| Point A |         ?       |        ✗          |         ✓
| Point B |         ✓       |         ✗          |        ✓
| Point C |         ✓       |         ✓          |        ✓      
| Point D |         ✓       |         ✓          |        ✓      
| Point E |         ✓       |         ✓          |        ✓

### Empirical Complexity Analysis

- Both demonstrate an exponential growth in terms of runtime although we have prefrence for the operation counting method because it doesn't rely on varying speeds of different operating systems.
