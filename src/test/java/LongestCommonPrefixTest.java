import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LongestCommonPrefixTest {
    private LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @ParameterizedTest
    @MethodSource("provideData")
    public void shouldReturnProperValue(String[] input, String expected){
        String actual = longestCommonPrefix.longestCommonPrefix(input);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideData(){
        return Stream.of(
                Arguments.of(new String[]{"flower","flow","flight"},"fl"),
                Arguments.of(new String[]{"dog","racecar","car"},""),
                Arguments.of(new String[]{"fotel","fotka"},"fot"),
                Arguments.of(new String[]{},""),
                Arguments.of(new String[]{""},""),
                Arguments.of(new String[]{"a"},"a"),
                Arguments.of(new String[]{"cir","car"},"c")
        );
    }
}
