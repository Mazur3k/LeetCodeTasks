/*
Given a string s and an integer array indices of the same length.
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
Return the shuffled string.
 */

public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        StringBuilder result = new StringBuilder();
        int positionFinder = 0;
        boolean notDone = true;
        while(notDone){
            for(int i =0; i < indices.length; i++){
                if(positionFinder == indices[i]){
                    result.append(s.charAt(i));
                    positionFinder++;
                }
            }
            notDone = positionFinder != s.length();
        }
        return result.toString();
    }

    //better solution
    public String restoreString2(String s, int[] indices) {
        char[] res_arr = new char[indices.length];
        char cc;

        for (int i = 0; i < indices.length; i++){
            cc = s.charAt(i);
            res_arr[indices[i]] = cc;
        }

        return String.valueOf(res_arr);
    }
}

/*
1. Search for indexes from beggining to the end from indicators
2. Get proper char from string
3. Concatenate to result
 */






