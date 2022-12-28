package longest_substring_without_repeating_characters;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "abcabcbb, 3",
            "bbbbb, 1",
            "pwwkew, 3"
    })
    void leetCodeTest(String str, int expectedResult) {
        int actualResult = solution.lengthOfLongestSubstring(str);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void shouldWorkForEmptyString() {
        String str = "";
        int actualResult = solution.lengthOfLongestSubstring(str);
        assertEquals(0, actualResult);
    }

}
