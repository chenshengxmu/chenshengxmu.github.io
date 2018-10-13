---
layout: post
title: Check for balanced parentheses in an expression
---
* Given an expression string exp , write a program to examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp. For example, the program should print true for exp = “[()]{}{[()()]()}” and false for exp = “[(])”

* ![img](https://www.geeksforgeeks.org/wp-content/uploads/Check-for-balanced-parentheses-in-an-expression-1.png)<-

* Algorithm: 
  1. Declare a character stack S. 
  2. Now traverse the expression string exp.     
    * If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.     
    * If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and if the popped character is the matching starting bracket then fine else parenthesis are not balanced. 
  3. After complete traversal, if there is some starting bracket left in stack then “not balanced”
* Time Complexity: O(n) Auxiliary Space: O(n) for stack.

