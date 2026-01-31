class Solution {
    public String largestEven(String s) {
        int pos = -1;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='2'){
                pos = i;
            }
        }
        if(pos==-1){
            return "";
        }
        else{
            return s.substring(0,pos+1);
        }        
    }
}