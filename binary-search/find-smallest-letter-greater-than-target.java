class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(Character i : letters){
            if(i>=target && target!=i){
                return i;
            }
        }
        return letters[0];
    }
}