import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {
    DateFormatter dateFormatter = new DateFormatter();

    @Test
    public void shouldFormatDate(){
        String input = "20th Oct 2052";
        String expected = "2052-10-20";
        String actual = dateFormatter.reformatDate(input);
        Assertions.assertEquals(expected, actual);
    }
}
