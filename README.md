# Speed Reader

## About

_(TODO: insert a description of the project here!)_

### Authors

*   Carrie Anne Little 
*   John Kafumbe

### Resources

*   _(TODO: list your resources here!)_
*   ...
*   `DrawingPanel.java` adapted from _[Building Java Programs](https://www.buildingjavaprograms.com/) by Reges and Stepp.

## Write-up

### Semantic Mysteries

#### Problem 1.1

First change modifies a local variable x which is a primative type
Second change modifies the x field in Cell c -- by reference
Third change modifies the x field in Cell c then points c to a new Cell where the x field is 0  -- by reference

#### Problem 1.2

Counter1 increments value by 1
Counter2 doubles value, a local variable that is then lost because the change made to it exists only within the increment function
Counter3 increments the value field in Counter3 class by some amount value
Counter4 increments some value by the value field stored in class Counter4

#### Problem 1.3

_(TODO: fill me in!)_

#### Problem 1.4

_(TODO: fill me in!)_

#### Problem 2.1

(always: ✓, sometimes: ?, never: ✗)

*   Point A:
    + `x1 == 0`:
    + `x2 < 0`:
*   Point B:
    + `x1 == 0`:
    + `x2 < 0`:
*   Point C:
    + `y1 < 5`:
    + `y2 > 0`:
*   Point D:
    + `z > y1`:
    + `z < 0`:

#### Problem 2.2

(always: ✓, sometimes: ?, never: ✗)

|         | `s.length >= 2` | `ret.length() > 0` | `ret.length() % 2 == 0`
| ------- | --------------- | ------------------ | -----------------------
| Point A |                 |                    |
| Point B |                 |                    |
| Point C |                 |                    |
| Point D |                 |                    |
| Point E |                 |                    |

### Empirical Complexity Analysis

_(TODO: fill me in!)_
