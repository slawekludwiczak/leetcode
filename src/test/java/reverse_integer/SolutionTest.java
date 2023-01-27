package reverse_integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "123, 321",
            "-123, -321",
            "120, 21",
            "1534236469, 0",
            "-2147483648, 0"
    })
    void leetCodeTest1(int given, int expected) {
        int result= solution.reverse(given);
        assertEquals(expected, result);
    }
}
