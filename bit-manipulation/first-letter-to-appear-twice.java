class Solution {
    public char repeatedCharacter(String s) {
        int[] arr = new int[26];
        for(int i = 0; i<s.length(); i++){
            arr[((int)s.charAt(i))-97 ] += 1;
            if (( arr[(int)s.charAt(i)-97])==2){
                return s.charAt(i);
            }
        }
        return 'a';
    }
}