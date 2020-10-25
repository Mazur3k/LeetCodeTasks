public class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinks = numBottles;
        int emptyBottles = numBottles;
        int reminder = 0;
        while(emptyBottles >= numExchange){
            numBottles = getFulfilledBottles(emptyBottles, numExchange);
            reminder = emptyBottles%numExchange;
            emptyBottles = numBottles + reminder;
            drinks += numBottles;
        }
        return drinks;
    }

    private int getFulfilledBottles(int numEmptyBottles, int numExchange){
        return numEmptyBottles/numExchange;
    }
}
