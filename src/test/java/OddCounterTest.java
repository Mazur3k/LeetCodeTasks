import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class OddCounterTest {
    private OddCounter oddCounter = new OddCounter();

    @ParameterizedTest
    @MethodSource("provideData")
    public void shouldReturnCorrectCount(int low, int high, int expected){
        int actual = oddCounter.countOdds(low, high);
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideData(){
        return Stream.of(
                Arguments.of(3,7,3),
                Arguments.of(8,10,1)
        );
    }
}
