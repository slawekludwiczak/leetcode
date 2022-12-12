package palindrome_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void leetCode1() {
        int x = 121;
        boolean palindrome = solution.isPalindrome(x);
        assertTrue(palindrome);
    }

    @Test
    void leetCode2() {
        int x = -121;
        boolean palindrome = solution.isPalindrome(x);
        assertFalse(palindrome);
    }

    @Test
    void leetCode3() {
        int x = 10;
        boolean palindrome = solution.isPalindrome(x);
        assertFalse(palindrome);
    }
}
