# lesson20 - Using a Deque

## Overview

A palindrome is a string that reads the same backwards and forwards. One of the cool things about
data structures is they can allow you to quickly solve a problem that may initially look complex! We
will use a [deque](https://docs.oracle.com/javase/10/docs/api/java/util/Deque.html) to implement a
program that tests whether a line of text is a palindrome. The program reads a line, then outputs
whether the input is a palindrome or not.

## Important Links

- [Lab Overview](https://youtu.be/-KJkOxlP_0w)
- [Class Coding standards](https://shanep-cs2.github.io/docs/coding-standards.html)
- [Cloning and Submitting](https://shanep-cs2.github.io/docs/github.html)

## Task 1 - Implement Palindrome class

You will complete the MyPalindrome class that implements the Palindrome interface. For your
implementation you are **required** to use a
[deque](https://docs.oracle.com/javase/10/docs/api/java/util/Deque.html). You can't implement the
solution using any other data structures. 

**Hint:** The deque must be a deque of Characters.

## Task 2 - Write Unit tests 

Write enough tests to insure your code is correct! We can get a list of palindrome's from
[dictionary.com](https://www.dictionary.com/e/palindromic-word/) that we can use in our unit
tests.

## Task 3 - Input output

Complete the file **App.java** to read a line from standard input and output if it is a palindrome
or not. You will need to use a scanner class to get user input and then output the following: 

- YES, (the input) is a palindrome
- NO, (the input) is not a palindrome

### Example input/output

Input:

```
taco cat!
```

Output:

```
YES, "taco cat!" is a palindrome.
```

## Task 4 - Complete the Retrospective

Once you have completed all the tasks open the file **Retrospective.md** and complete each section
with a TODO comment. 

## Task 5 - Add, Commit, Push your code

Once you are finished you need to make sure that you have pushed all your code to GitHub for
grading!
