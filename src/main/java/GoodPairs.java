import java.util.concurrent.atomic.AtomicInteger;

public class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int counter = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    if(i < j){
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
}
