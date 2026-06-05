class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        boolean bar = false;
        for(int i = 0; i<s.length(); i++){
            if(!bar && s.charAt(i)!='|'){
                if(s.charAt(i)=='*'){
                    count++;
                }
            }
            else{
                if(s.charAt(i)=='|'){
                    bar=!bar;
                }
            }
        }
        return count;
    }
}