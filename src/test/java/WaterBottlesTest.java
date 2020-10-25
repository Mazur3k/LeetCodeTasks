import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class WaterBottlesTest {
    WaterBottles waterBottles = new WaterBottles();

    @ParameterizedTest
    @MethodSource("provideData")
    public void shouldReturnCorrectValue(int inputBottles, int numExchange, int expected){
        int actual = waterBottles.numWaterBottles(inputBottles, numExchange);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideData(){
        return Stream.of(
                Arguments.of(15,5,18),
                Arguments.of(9,3,13),
                Arguments.of(15,4,19),
                Arguments.of(15,8,17));
    }
}
