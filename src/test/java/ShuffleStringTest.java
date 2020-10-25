import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ShuffleStringTest {

    private ShuffleString shuffleString = new ShuffleString();

    @ParameterizedTest
    @MethodSource("provideData")
    public void shouldRestoreString(String input, int[] indicators, String expected){
        String actual = shuffleString.restoreString(input,indicators);
        Assertions.assertEquals(expected,actual);
    }

    private static Stream<Arguments> provideData(){
        return Stream.of(
                Arguments.of("codeleet", new int[]{4,5,6,7,0,2,1,3},"leetcode"),
                Arguments.of("abc", new int[]{0,1,2},"abc"),
                Arguments.of("aiohn", new int[]{3,1,4,2,0},"nihao")
        );
    }
}
