package _1323_maximum_69_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "9669,9969",
            "9996,9999",
            "9999,9999"
    })
    void leetCodeTest1(int input, int expectedResult) {
        int result = solution.maximum69Number(input);
        assertEquals(expectedResult, result);
    }

}