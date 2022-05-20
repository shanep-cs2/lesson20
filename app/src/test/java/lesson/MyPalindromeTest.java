package lesson;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MyPalindromeTest {

    @Test
    public void isPalindrome() {
        //Test both even and odd combos
        Palindrome pal = new MyPalindrome();
        String p = "taco cat";       
        assertTrue(pal.isPalindrome(p));
        p = "Sir, I demand, I am a maid named Iris.";
        assertTrue(pal.isPalindrome(p));
        p = "kayak";
        assertTrue(pal.isPalindrome(p));
        p = "KaYAk";
        assertTrue(pal.isPalindrome(p));
        p  = "kayak!!!!!";
        assertTrue(pal.isPalindrome(p));
        p  = "noon";
        assertTrue(pal.isPalindrome(p));
        p  = "1noon1";
        assertTrue(pal.isPalindrome(p));
    }   

    @Test
    public void testDigits(){
        Palindrome pal = new MyPalindrome();
        String p = "112211";       
        assertTrue(pal.isPalindrome(p));
        p = "1 1 2 11";       
        assertTrue(pal.isPalindrome(p));
    }

    @Test
    public void notPalindrome(){
        Palindrome pal = new MyPalindrome();
        String p = "taco catt";
        assertFalse(pal.isPalindrome(p));
        p = "Sirr, I demand, I am a maid named Iris.";
        assertFalse(pal.isPalindrome(p));
        p = "kayakrrr";
        assertFalse(pal.isPalindrome(p));
        p = "kayakrrrr";
        assertFalse(pal.isPalindrome(p));
    }

    @Test
    public void testNull(){
        String p = null;
        Palindrome pal = new MyPalindrome();
        assertFalse(pal.isPalindrome(p));
    }

    @Test 
    public void testOne(){
        String p = "a";
        Palindrome pal = new MyPalindrome();
        assertTrue(pal.isPalindrome(p));
        p = "a!.&^#%#*%*(#&#^%#^@!$^&##@";
        assertTrue(pal.isPalindrome(p));
    }

    @Test
    public void testOnlyPunc(){
        String p = "!";
        Palindrome pal = new MyPalindrome();
        assertFalse(pal.isPalindrome(p));
        p = "!#$%#$^@$%@#%^$#%!#$^&%^*%&*";
        assertFalse(pal.isPalindrome(p));
    }

    @Test
    public void testEmpty(){
        String p = "";
        Palindrome pal = new MyPalindrome();
        assertFalse(pal.isPalindrome(p));
    }

}
