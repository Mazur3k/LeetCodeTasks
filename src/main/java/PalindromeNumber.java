public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        char[] input = temp.toCharArray();
        int length = input.length;
        for(int i = 0; i<length/2+1; i++){
            if(input[i] != input[length-i-1]){
                return false;
            }
        }
        return true;
    }
    public boolean isPalindromeInt(int x){
        if(x < 0 || (x%10 == 0 && x!=0)){
            return false;
        }else{
            int reverseInt = 0;
            while(reverseInt < x){
                reverseInt = reverseInt * 10 + x%10;
                x /= 10;
            }
            return reverseInt == x || reverseInt/10 == x;
        }
    }
}
