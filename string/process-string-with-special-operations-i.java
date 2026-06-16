class Solution {
    public String processStr(String s) {
        StringBuilder op = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='#'){
                op.append(op.toString());
            } else if (c=='%'){
                op.reverse();
            } else if (c!='*'){
                op.append(c);
            } else {
                if(op.length()!=0){
                    if (c=='*'){
                        op.deleteCharAt(op.length()-1);
                    }
                }
            }
        }
        return op.toString();
    }
}