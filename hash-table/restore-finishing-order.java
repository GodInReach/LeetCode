class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        var hs = new HashSet<Integer>();
        for(int i : friends){
            hs.add(i);
        }
        int[] arr = new int[friends.length];
        int c = 0;
        for(int i : order){
            if(hs.contains(i)){
                arr[c]=i;
                c++;
            }
        }
        return arr;
    }
}