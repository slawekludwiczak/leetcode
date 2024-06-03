package _151_reverse_words_in_a_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "the sky is blue,blue is sky the",
            "  hello world  ,world hello",
            "a good   example,example good a"
    })
    void leetCodeTest(String source, String target) {
        String result = solution.reverseWords(source);
        assertEquals(target, result);
    }
}