import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class RomanToIntConverterTest {
    private RomanToIntConverter romanToIntConverter = new RomanToIntConverter();

    @ParameterizedTest
    @MethodSource("provideData")
    public void shouldConvertProperly(String input, int expected){
        int actual = romanToIntConverter.romanToInt(input);
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideData(){
        return Stream.of(
                Arguments.of("III", 3),
                Arguments.of("IV", 4),
                Arguments.of("IX", 9),
                Arguments.of("LVIII", 58),
                Arguments.of("MCMXCIV", 1994));
    }
}
