public class AritmeticProgression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int[] sorted = sort(arr);
        int progression = returnProgresion(sorted);
        return checkArritmeticProgression(sorted,progression);
    }

    private int[] sort(int[] table){
        int temp = 0;
        for(int i = 0; i<table.length;i++){
            for(int j = 0; j<table.length; j++){
                if(table[i] > table[j]){
                    temp =   table[i];
                    table[i] = table[j];
                    table[j] = temp;
                }
            }
        }
        return table;
    }

    private int returnProgresion(int[] table){
        return table.length > 1 ? table[1] - table[0] : -1;
    }

    private boolean checkArritmeticProgression(int[] table, int progression){
        boolean result = true;
        if(progression == -1){
            return false;
        }else{
            for(int i=1; i<table.length; i++){
                if(table[i] - table[i-1] != progression){
                    result = false;
                }
            }
            return result;
        }
    }
}
