class Solution {
    public int minimumCardPickup(int[] cards) {
        int[] arr = new int[cards.length+1];
        Arrays.fill(arr,Integer.MAX_VALUE);
        for(int i = 0; i<cards.length; i++){
            for(int j = i+1; j<cards.length; j++){
                if(cards[i]==cards[j]){
                    arr[i]=j;
                    break;
                }
            }
        }
        int mini = Integer.MAX_VALUE;
        for(int i : arr){
            mini=Math.min(mini, i);
        }
        if(mini==Integer.MAX_VALUE){
            return -1;
        }
        return mini+1;
    }
}