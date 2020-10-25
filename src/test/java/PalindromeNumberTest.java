import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class PalindromeNumberTest {
    private PalindromeNumber palindromeNumber = new PalindromeNumber();

    @ParameterizedTest
    @MethodSource("provideData")
    public void shouldRevertIntString(int input, boolean expected){
        boolean actual = palindromeNumber.isPalindrome(input);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("provideData")
    public void shouldRevertInt(int input, boolean expected){
        boolean actual = palindromeNumber.isPalindromeInt(input);
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideData(){
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(1111, true),
                Arguments.of(10, false),
                Arguments.of(-10, false)
        );
    }
}
