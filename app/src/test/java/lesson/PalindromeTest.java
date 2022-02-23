package lesson;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class PalindromeTest {

    @Test
    public void methodReturnsHello() {
        // Example for testing the SayHello class!
        Palindrome hello = new Palindrome();
        assertEquals(hello.SaySomething(), "Hello");
    }   
}
