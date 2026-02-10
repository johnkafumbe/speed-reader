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
Text sources: 
https://en.wikipedia.org/wiki/Donna_Haraway
https://en.wikipedia.org/wiki/Teresa_of_%C3%81vila
https://en.wikipedia.org/wiki/Airplane
en.wikipedia.org/wiki/Valentine's_Day


Test questions:

Taresa of Avila Questions:
1. Who was Teresa of Avila?
2. What was Taresa of Avila known for?
3. What was the name of the order she founded?
4. What is one of the four stages of assent of the soul to god?
5. What was the title of of Teresa of Avila's Biography?

Airplane Questions:
1. How are airplanes propelled?
2. How much of the world's cargo movement is done by plane?
3. Who invented and flew the first airplane?
4. When did airplane technology "take off"?
5. What was the first successful commercial jet?


Participants:
Asha Kulkarni        kulkarni2@grinnell.edu
Sanuthi Amarasingha  amarasin@grinnell.edu
Mirakel Schwartz     schwartz7@grinnell.edu

Sanuthi regular-read about Taresa of Avila and used the speed-reader at 300 wpm
to learn about airplanes. Her responses are as follows:

Taresa of Avila
1. nun
2. 4 prayer things of smth: god???
3. [left blank]
4. Prayer, smth,
5. [left blank]

Airplane
1. Jet fuel
2. [left blank]
3. Wright
4. 17 smoething
5. Beoing


Did your participants demonstrate that they were able to comprehend what they 
were reading with your speed reader?
It seemed that participants were able to comprehend some of what they read 
using the speed reader, but stuggled to recall specific details. The struggle
to recall specific details, however, was demonstrated in both tests. Asha 
demonstrated the best reading comprehension having the longest and most detailed 
responses, although we have question if she has any prior knowledge that would 
have aided her answers. We have similar doubts about Sanuthi's results about 
airplanes. 


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


