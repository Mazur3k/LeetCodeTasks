import org.junit.jupiter.api.Assertions;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class AritmeticProgressionTest {
    private AritmeticProgression aritmeticProgression = new AritmeticProgression();

    @ParameterizedTest
    @MethodSource("provideData")
    public void shouldReturnCorrectResult(int[] input, boolean expected){
        boolean actual = aritmeticProgression.canMakeArithmeticProgression(input);
        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideData(){
        return Stream.of(
                Arguments.of(new int[]{3,5,1}, true),
                Arguments.of(new int[]{3,9,1}, false));

    }

    @Test
    public void shouldReturnTrue(){
        int[] input = {3,5,1};
        boolean actual = aritmeticProgression.canMakeArithmeticProgression(input);

        Assertions.assertEquals(true, actual);
    }

    @Test
    public void shouldReturnFalse(){
        int[] input = {3,6,1};
        boolean actual = aritmeticProgression.canMakeArithmeticProgression(input);

        Assertions.assertEquals(false, actual);
    }

    @Test
    public void shouldReturnFalseForAllZeros(){
        int[] input = {0,0,0,0};
        boolean actual = aritmeticProgression.canMakeArithmeticProgression(input);

        Assertions.assertEquals(true, actual);
    }
}
