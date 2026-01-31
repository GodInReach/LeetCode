class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i : candies){
            if(max<i){
                max = i;
            }
        }
        ArrayList<Boolean> li = new ArrayList<Boolean>();
        for(int i : candies){
            if(i+extraCandies >= max){
                li.add(true);
            }
            else{
                li.add(false);
            }
        }
        return li;
    }
}