class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0){
            return 0;
        }
        int tot = 0;
        int dur = 0;
        int ptr = 0;
        for(int i = 0; i<(timeSeries[timeSeries.length-1]-1+duration); i++){
            if(i==timeSeries[ptr]){
                ptr++;
                dur=duration-1;
                tot++;
            }
            else if(dur!=0){
                dur--;
                tot++;

            }
        }
        return tot+1;
    }
}