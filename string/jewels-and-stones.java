class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> je = new HashSet<Character>();
        for(int i = 0; i<jewels.length(); i++){
            je.add(jewels.charAt(i));
        }
        int count = 0;
        for(int i = 0; i<stones.length(); i++){
            if(je.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}

//Time: O(N)