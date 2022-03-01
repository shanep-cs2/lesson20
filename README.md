# lesson20 - Using a Deque

## Overview

A palindrome is a string that reads the same backwards and forwards. One of the cool things about
data structures is they can allow you to quickly solve a problem that may initially look complex! We
will use a [deque](https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html) to implement a
program that tests whether a line of text is a palindrome. The program reads a line, then outputs
whether the input is a palindrome or not.

## Task 1 - Implement Palindrome class

You will complete the Palindrome class. Your class will have just one method with the following
signature: 

```java
public static boolean isPalindrome(String p);
```
- Ignore punctuation and spacing. Assume all alphabetic characters will be lowercase.
- Special case: A one-character string is a palindrome.

**Hint:** The deque must be a deque of Characters.

## Task 2 - Write Unit tests 

Write enough tests to insure your code is correct!

## Task 3 - Input output

Complete the file **App.java** to read a line from standard input and output if it is a palindrome
or not.

### Example input/output

Input:

```
taco cat!
```

Output:

```
Yes, "taco cat!" is a palindrome.
```

