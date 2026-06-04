class Solution {
    public int reverseDegree(String s) {
        int c = 0;
        for(int i = 0; i<s.length(); i++){
            c+=(26-(s.charAt(i)-'a'))*(i+1);
        }
    return c;
    }
}