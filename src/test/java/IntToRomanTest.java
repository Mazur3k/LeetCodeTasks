import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IntToRomanTest {
    private IntToRoman intToRoman = new IntToRoman();

    @ParameterizedTest
    @MethodSource("provideData")
    public void shouldReturnCorrectRomanNumber(int input, String expected){
        String actual = intToRoman.intToRoman(input);
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideData(){
        return Stream.of(
                Arguments.of(13, "XIII")
        );
    }
}
