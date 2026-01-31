class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        String len;
        String max;
        String sel;
        if(word1.length()>word2.length()){
            sel = word2; max = word1;
        }
        else{
            sel = word1; max = word2;
        }
        for (int i = 0; i<max.length(); i++){
            if(i<sel.length()){
                str.append(word1.charAt(i));
                str.append(word2.charAt(i));
            }
            else{
                str.append(max.charAt(i));
            }
        }
        return str.toString();
    }
}