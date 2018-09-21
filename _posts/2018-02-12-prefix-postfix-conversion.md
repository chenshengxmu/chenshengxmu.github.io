---
layout: post
title: Prefix to Postfix Conversion
---
* Prefix : An expression is called the prefix expression if the operator appears in the expression before the operands. Simply of the form (operator operand1 operand2). Example : *+AB-CD (Infix : (A+B) * (C-D) )
* Postfix: An expression is called the postfix expression if the operator appears in the expression after the operands. Simply of the form (operand1 operand2 operator). Example : AB+CD-* (Infix : (A+B * (C-D) )
* Given a Prefix expression, convert it into a Postfix expression. Conversion of Prefix expression directly to Postfix without going through the process of converting them first to Infix and then to Postfix is much better in terms of computation and better understanding the expression (Computers evaluate using Postfix expression).
* Examples:
{% highlight cpp %}
Input :  Prefix :  *+AB-CD
Output : Postfix : AB+CD-*
Explanation : Prefix to Infix :  (A+B) * (C-D)
              Infix to Postfix :  AB+CD-*

Input :  Prefix :  *-A/BC-/AKL
Output : Postfix : ABC/-AK/L-*
Explanation : Prefix to Infix :  A-(B/C)*(A/K)-L
              Infix to Postfix : ABC/-AK/L-*
{% endhighlight %}
* Algorithm for Prefix to Postfix:
{% highlight cpp %}
// CPP Program to convert prefix to postfix
#include <iostream>
#include <stack>
using namespace std;

// funtion to check if character is operator or not
bool isOperator(char x) {
  switch (x) {
  case '+':
  case '-':
  case '/':
  case '*':
    return true;
  }
  return false;
}

// Convert prefix to Postfix expression
string preToPost(string pre_exp) {

  stack<string> s;

  // length of expression
  int length = pre_exp.size();

  // reading from right to left
  for (int i = length - 1; i >= 0; i--) {

    // check if symbol is operator
    if (isOperator(pre_exp[i])) {

      // pop two operands from stack
      string op1 = s.top(); s.pop();
      string op2 = s.top(); s.pop();

      // concat the operands and operator
      string temp = op1 + op2 + pre_exp[i];

      // Push string temp back to stack
      s.push(temp);
    }

    // if symbol is an operand
    else {

      // push the operand to the stack
      s.push(string(1, pre_exp[i]));
    }
  }

  // stack contains only the Postfix expression
  return s.top();
}

// Driver Code
int main() {
  string pre_exp = "*-A/BC-/AKL";
  cout << "Postfix : " << preToPost(pre_exp);
  return 0;
}
{% endhighlight %}
{% highlight cpp %}
Postfix : ABC/-AK/L-*
{% endhighlight %}
* Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

