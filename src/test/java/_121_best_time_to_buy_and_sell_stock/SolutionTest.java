package _121_best_time_to_buy_and_sell_stock;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("inputProvider")
    void leetCodeTest1(int[] input, int expectedResult) {
        int result = solution.maxProfit(input);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> inputProvider() {
        return Stream.of(
                Arguments.of(new int[]{7,1,5,3,6,4}, 5),
                Arguments.of(new int[]{1,2,3,4,5}, 4),
                Arguments.of(new int[]{7,6,4,3,1}, 0)
        );
    }

}