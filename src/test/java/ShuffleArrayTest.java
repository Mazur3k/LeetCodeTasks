import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShuffleArrayTest {
    ShuffleArray shuffle;
    @BeforeEach
    public void setUp(){
        shuffle = new ShuffleArray();
    }


    @Test
    public void shouldShuffleTables(){
        int[] input = {1,2,3,4,5,6};
        int[] expected = {1,4,2,5,3,6};
        int[] actual = shuffle.shuffle(input, 3);

        Assertions.assertArrayEquals(expected, actual);


    }
}
