---
layout: post
title: Check for balanced parentheses in an expression
---
* Given an expression string exp , write a program to examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp. For example, the program should print true for exp = “[()]{}{[()()]()}” and false for exp = “[(])”

![img](https://www.geeksforgeeks.org/wp-content/uploads/Check-for-balanced-parentheses-in-an-expression-1.png)
* Algorithm: 1) Declare a character stack S. 2) Now traverse the expression string exp.     a) If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.     b) If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and if the popped character is the matching starting bracket then fine else parenthesis are not balanced. 3) After complete traversal, if there is some starting bracket left in stack then “not balanced”
{% highlight cpp %}
// CPP program to check for balanced parenthesis.
#include<bits/stdc++.h>
using namespace std;

// function to check if paranthesis are balanced
bool areParanthesisBalanced(string expr)
{
    stack<char> s;
    char x;

    // Traversing the Expression
    for (int i=0; i<expr.length(); i++)
    {
        if (expr[i]=='('||expr[i]=='['||expr[i]=='{')
        {
            // Push the element in the stack
            s.push(expr[i]);
            continue;
        }

        // IF current current character is not opening
        // bracket, then it must be closing. So stack
        // cannot be empty at this point.
        if (s.empty())
           return false;

        switch (expr[i])
        {
        case ')':

            // Store the top element in a
            x = s.top();
            s.pop();
            if (x=='{' || x=='[')
                return false;
            break;

        case '}':

            // Store the top element in b
            x = s.top();
            s.pop();
            if (x=='(' || x=='[')
                return false;
            break;

        case ']':

            // Store the top element in c
            x = s.top();
            s.pop();
            if (x =='(' || x == '{')
                return false;
            break;
        }
    }

    // Check Empty Stack
    return (s.empty());
}

// Driver program to test above function
int main()
{
    string expr = "{()}[]";

    if (areParanthesisBalanced(expr))
        cout << "Balanced";
    else
        cout << "Not Balanced";
    return 0;
}
{% endhighlight %}
{% highlight c %}
#include<stdio.h>
#include<stdlib.h>
#define bool int

/* structure of a stack node */
struct sNode
{
   char data;
   struct sNode *next;
};

/* Function to push an item to stack*/
void push(struct sNode** top_ref, int new_data);

/* Function to pop an item from stack*/
int pop(struct sNode** top_ref);

/* Returns 1 if character1 and character2 are matching left
   and right Parenthesis */
bool isMatchingPair(char character1, char character2)
{
   if (character1 == '(' && character2 == ')')
     return 1;
   else if (character1 == '{' && character2 == '}')
     return 1;
   else if (character1 == '[' && character2 == ']')
     return 1;
   else
     return 0;
}

/*Return 1 if expression has balanced Parenthesis */
bool areParenthesisBalanced(char exp[])
{
   int i = 0;

   /* Declare an empty character stack */
   struct sNode *stack = NULL;

   /* Traverse the given expression to check matching parenthesis */
   while (exp[i])
   {
      /*If the exp[i] is a starting parenthesis then push it*/
      if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
        push(&stack, exp[i]);

      /* If exp[i] is an ending parenthesis then pop from stack and 
          check if the popped parenthesis is a matching pair*/
      if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']')
      {
            
          /*If we see an ending parenthesis without a pair then return false*/
         if (stack == NULL)
           return 0; 

         /* Pop the top element from stack, if it is not a pair 
            parenthesis of character then there is a mismatch.
            This happens for expressions like {(}) */
         else if ( !isMatchingPair(pop(&stack), exp[i]) )
           return 0;
      }
      i++;
   }
   
   /* If there is something left in expression then there is a starting
      parenthesis without a closing parenthesis */
   if (stack == NULL)
     return 1; /*balanced*/
   else
     return 0;  /*not balanced*/
} 

/* UTILITY FUNCTIONS */
/*driver program to test above functions*/
int main()
{
  char exp[100] = "{()}[]";
  if (areParenthesisBalanced(exp))
    printf("Balanced \n");
  else
    printf("Not Balanced \n");  
  return 0;
}    

/* Function to push an item to stack*/
void push(struct sNode** top_ref, int new_data)
{
  /* allocate node */
  struct sNode* new_node =
            (struct sNode*) malloc(sizeof(struct sNode));

  if (new_node == NULL)
  {
     printf("Stack overflow n");
     getchar();
     exit(0);
  }           

  /* put in the data  */
  new_node->data  = new_data;

  /* link the old list off the new node */
  new_node->next = (*top_ref);  

  /* move the head to point to the new node */
  (*top_ref)    = new_node;
}

/* Function to pop an item from stack*/
int pop(struct sNode** top_ref)
{
  char res;
  struct sNode *top;

  /*If stack is empty then error */
  if (*top_ref == NULL)
  {
     printf("Stack overflow n");
     getchar();
     exit(0);
  }
  else
  {
     top = *top_ref;
     res = top->data;
     *top_ref = top->next;
     free(top);
     return res;
  }
}
{% endhighlight %}
{% highlight java %}
// Java program for checking
// balanced Parenthesis

public class BalancedParan 
{
    static class stack 
    {
        int top=-1;
        char items[] = new char[100];

        void push(char x) 
        {
            if (top == 99) 
            {
                System.out.println("Stack full");
            } 
            else 
            {
                items[++top] = x;
            }
        }

        char pop() 
        {
            if (top == -1) 
            {
                System.out.println("Underflow error");
                return '\0';
            } 
            else 
            {
                char element = items[top];
                top--;
                return element;
            }
        }

        boolean isEmpty() 
        {
            return (top == -1) ? true : false;
        }
    }
    
    /* Returns true if character1 and character2
       are matching left and right Parenthesis */
    static boolean isMatchingPair(char character1, char character2)
    {
       if (character1 == '(' && character2 == ')')
         return true;
       else if (character1 == '{' && character2 == '}')
         return true;
       else if (character1 == '[' && character2 == ']')
         return true;
       else
         return false;
    }
    
    /* Return true if expression has balanced 
       Parenthesis */
    static boolean areParenthesisBalanced(char exp[])
    {
       /* Declare an empty character stack */
       stack st=new stack();
     
       /* Traverse the given expression to 
          check matching parenthesis */
       for(int i=0;i<exp.length;i++)
       {
          
          /*If the exp[i] is a starting 
            parenthesis then push it*/
          if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
            st.push(exp[i]);
     
          /* If exp[i] is an ending parenthesis 
             then pop from stack and check if the 
             popped parenthesis is a matching pair*/
          if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']')
          {
                 
              /* If we see an ending parenthesis without 
                 a pair then return false*/
             if (st.isEmpty())
               {
                   return false;
               } 
     
             /* Pop the top element from stack, if 
                it is not a pair parenthesis of character 
                then there is a mismatch. This happens for 
                expressions like {(}) */
             else if ( !isMatchingPair(st.pop(), exp[i]) )
               {
                   return false;
               }
          }
          
       }
        
       /* If there is something left in expression 
          then there is a starting parenthesis without 
          a closing parenthesis */
      
       if (st.isEmpty())
         return true; /*balanced*/
       else
         {   /*not balanced*/
             return false;
         } 
    } 
    
    /* UTILITY FUNCTIONS */
    /*driver program to test above functions*/
    public static void main(String[] args) 
    {
        char exp[] = {'{','(',')','}','[',']'};
          if (areParenthesisBalanced(exp))
            System.out.println("Balanced ");
          else
            System.out.println("Not Balanced ");  
    }

}
{% endhighlight %}
{% highlight cpp %}
Output:
Balanced
{% endhighlight %}
* Time Complexity: O(n) Auxiliary Space: O(n) for stack.
* Please write comments if you find any bug in above codes/algorithms, or find other ways to solve the same problem

