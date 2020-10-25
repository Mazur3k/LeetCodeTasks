import java.util.stream.IntStream;

public class OddCounter {
    public int countOdds(int low, int high) {
        return (int)IntStream.range(low, high+1).filter(e -> e%2 != 0).count();
    }
    public int countOddsSneaky(int low, int high) {
        if(low%2==0 && high%2==0){
            return (high - low)/2;
        }else{
            return (high - low)/2+1;
        }
    }
}
