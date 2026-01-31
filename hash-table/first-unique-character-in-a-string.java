class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            mp.merge(s.charAt(i),1,Integer::sum);
        }
        for(int i = 0; i<s.length(); i++){
            if(mp.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}