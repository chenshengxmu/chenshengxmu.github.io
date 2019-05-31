---
layout: post
title: Check for balanced parentheses in an expression
---

```java
    static boolean areParenthesisBalanced(char exp[])
    {

        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < exp.length; i++)
        {

            if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
                st.push(exp[i]);

            if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']')
            {

                if (st.isEmpty())
                {
                    return false;
                } else if (!isMatchingPair(st.pop(), exp[i]))
                {
                    return false;
                }
            }

        }

        if (st.isEmpty())
            return true;
        else
        {
            return false;
        }
    }

    static boolean isMatchingPair(char character1, char character2)
    {
        if (character1 == '(' && character2 == ')')
        {
            return true;
        }
        else if (character1 == '{' && character2 == '}')
        {
            return true;
        }
        else if (character1 == '[' && character2 == ']')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
```
