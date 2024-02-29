package _28_find_the_index_first_occurence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "sadbutsad, sad, 0",
            "leetcode, leeto, -1"
    })
    void leetCodeTests(String haystack, String needle, int expectedResult) {
        int result = solution.strStr(haystack, needle);
        assertEquals(expectedResult, result);
    }
}