class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){return "";}
        else if (strs.length == 1){return strs[0];}
        StringBuilder str = new StringBuilder();
        char c = 'a';
        int dead = 0;
        int min = Integer.MAX_VALUE;
        for(String i : strs){
            if(min>i.length()){
                min=i.length();
            }
        }
        for(int i = 0; i<min; i++){
            c = strs[0].charAt(i); 
            for(int j = 0; j<strs.length; j++){
                if (c!=(strs[j].charAt(i))){
                    dead = 1;
                    break;
                }
            }
            if(dead!=0){break;}
            str.append(c);
        }
        return str.toString();
    }
}