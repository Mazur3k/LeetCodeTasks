public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] x = createTableX(nums, n);
        int[] y = createTableY(nums, n);
        return createResultTable(x, y, n);
    }

    private int[] createTableX(int[] nums, int n){
        int[] result = new int[n];
        for(int i=0; i<n; i++){
            result[i] = nums[i];
        }
        return result;
    }

    private int[] createTableY(int[] nums, int n){
        int[] result = new int[n];
        int j = 0;
        for(int i = n; i < 2*n; i++){
            result[j++] = nums[i];
        }
        return result;
    }

    private int[] createResultTable(int[] tableX, int[] tableY, int n){
        int[] result = new int[2*n];
        int j = 0;
        for(int i=0; i<n; i++){
            result[j++] = tableX[i];
            result[j++] = tableY[i];
        }
        return result;
    }
}


