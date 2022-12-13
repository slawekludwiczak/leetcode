package string_to_integer_atoi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource(
            {
                    "42, 42",
                    "-42, -42",
                    "+42, 42",
                    "+-12, 0",
                    "0, 0",
                    "0, 0",
                    "   42, 42",
                    "   -42, -42",
                    "   0042, 42",
                    "   -0042, -42",
                    "2147483647, 2147483647",
                    "2147483648, 2147483647", //over max
                    "-2147483648, -2147483648",
                    "-2147483649, -2147483648", //under min
                    "4193 with words, 4193",
                    "00000-42a1234, 0",
                    "   +0 123, 0",
                    "3.14159, 3",
                    "  -0012a42, -12",
            }
    )
    void leetCode(String input, int expectedResult) {
        int result = solution.myAtoi(input);
        assertEquals(expectedResult, result);
    }
}
