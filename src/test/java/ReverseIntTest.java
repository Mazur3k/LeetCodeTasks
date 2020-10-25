import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ReverseIntTest {
    ReverseInt reverseInt = new ReverseInt();

    @ParameterizedTest
    @MethodSource("provideData")
    public void shouldReverseCorrectly(int input, int expected){
        int actual = reverseInt.reverse(input);
        Assertions.assertEquals(expected,actual);
    }

    private static Stream<Arguments> provideData(){
        return Stream.of(
                Arguments.of(1234,4321),
                Arguments.of(-123,-321),
                Arguments.of(0,0),
                Arguments.of(120,21)
        );
    }
}
