package valid_parentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "(), true",
            "()[]{}, true",
            "(], false",
            "{[]}, true",
            "[, false",
            "(, false",
            "{, false"
    })
    void leetCodeTest1(String s, boolean expectedResult) {
        boolean actualResult = solution.isValid(s);
        assertEquals(expectedResult, actualResult);
    }
}
