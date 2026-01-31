class Solution {
    public char findTheDifference(String s, String t) {
        int x = 0;
        for (char i : (s+t).toCharArray()) x^=i;
        return (char) x;
    }
}