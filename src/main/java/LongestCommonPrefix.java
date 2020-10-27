import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestCommonPrefix {
    private final String EMPTY_STRING = "";

    public String longestCommonPrefix(String[] strs) {
        String first = EMPTY_STRING;
        if(strs.length == 0 || EMPTY_STRING.equals(strs[0])){
            return EMPTY_STRING;
        }else if(strs.length == 1){
            return strs[0];
        }else{
            first = strs[0];
        }

        int common = 0;
        int length = strs.length;

        int shortestWord = shortestWordLength(strs);

        List<Integer> commons = new ArrayList<>();

        for(int i=1; i<length; i++){
            for(int j=0; j<shortestWord; j++){
                if(first.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                common++;
            }
            commons.add(common);
            common = 0;
        }
        int minCommon = 0;
        if(commons.size() > 0){
            minCommon = Collections.min(commons);
        }
        return minCommon >0 ? first.substring(0, minCommon) : EMPTY_STRING;
    }

    private int shortestWordLength(String[] table){
        int min = table[0].length();
        for(String element : table){
            if(element.length() < min){
                min = element.length();
            }
        }
        return min;
    }
}
