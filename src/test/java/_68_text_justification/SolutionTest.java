package _68_text_justification;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void leetCodeTest1() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> result = solution.fullJustify(words, maxWidth);
        List<String> expectedResult = List.of(
                "This    is    an",
                "example  of text",
                "justification.  "
        );
        assertEquals(expectedResult, result);
    }

    @Test
    void leetCodeTest2() {
        String[] words = {"What", "must", "be", "acknowledgment", "shall", "be"};
        int maxWidth = 16;
        List<String> result = solution.fullJustify(words, maxWidth);
        List<String> expectedResult = List.of(
                "What   must   be",
                "acknowledgment  ",
                "shall be        "
        );
        assertEquals(expectedResult, result);
    }

    @Test
    void leetCodeTest3() {
        String[] words = {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
        int maxWidth = 20;
        List<String> result = solution.fullJustify(words, maxWidth);
        List<String> expectedResult = List.of(
                "Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  "
        );
        assertEquals(expectedResult, result);
    }
}