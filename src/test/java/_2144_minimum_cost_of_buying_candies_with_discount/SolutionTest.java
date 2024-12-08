package _2144_minimum_cost_of_buying_candies_with_discount;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("input")
    void leetCodeTest(int[] cost, int expectedResult) {
        int result = solution.minimumCost(cost);
        assertEquals(expectedResult, result);
    }

    static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, 5),
                Arguments.of(new int[]{6, 5, 7, 9, 2, 2}, 23),
                Arguments.of(new int[]{5, 5}, 10),
                Arguments.of(new int[]{1}, 1),
                Arguments.of(new int[]{5, 5, 5}, 10)
        );
    }
}