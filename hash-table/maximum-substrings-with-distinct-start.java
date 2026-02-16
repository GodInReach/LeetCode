class Solution {
    public int maxDistinct(String s) {
        Set<Character> ch = new HashSet<Character>();
        for(int i = 0; i<s.length(); i++){
            ch.add(s.charAt(i));
        }
        return ch.size();
    }
}
