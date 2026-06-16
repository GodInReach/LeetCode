class Solution {
    public String processStr(String s) {
        StringBuilder op = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='#'){
                op.append(op.toString());
            } else if (c=='*'){
                op.deleteCharAt(op.length()-1);
            } else if (c=='%'){
                op.reverse();
            } else{
                op.append(c);
            }
        }
        return op.toString();
    }
}