import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseInt {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        String input = Integer.toString(x);
        char[] digits = input.toCharArray();
        List<Integer> elements = new ArrayList<>();
        int firstIndex = isNegative ? 1 : 0;
        for(int i = firstIndex; i < digits.length; i++){
            elements.add(Character.getNumericValue(digits[i]));
        }
        Collections.reverse(elements);

        String output = elements.stream().map(e -> Integer.toString(e)).reduce("",(a,b) -> a+b);
        int result = 0;
        try{
            result = Integer.parseInt(output);
        }catch(NumberFormatException e){
            return 0;
        }
        return isNegative ? result*-1 : result;
    }

    public int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
