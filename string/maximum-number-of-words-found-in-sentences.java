class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String i : sentences){
            int temp = i.split(" ").length;
            if(max<temp){
                max=temp;
            }
        }
        return max;
    }
}