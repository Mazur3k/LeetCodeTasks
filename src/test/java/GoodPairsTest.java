import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GoodPairsTest {
    private GoodPairs goodPairs = new GoodPairs();

    @Test
    public void shouldReturnCorrectNumberOfPairs(){
        int[] input = {1,2,3,1,1,3};
        int expected = 4;
        int actual = goodPairs.numIdenticalPairs(input);

        Assertions.assertEquals(expected, actual);
    }
}
