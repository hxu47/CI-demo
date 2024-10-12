import org.example.Palindrome;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeTests {
    @Test
    public void test_Panlidrome_positiveCase(){
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome("abcda"));
    }

    @Test
    public void test_Panlidrome_negativeCase(){
        Palindrome palindrome = new Palindrome();
        assertFalse(palindrome.isPalindrome("abcbad"));
    }
}
