class Solution {
    public String addSpaces(String s, int[] spaces) {
        int sp = 0;
        StringBuilder op = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            if(sp<spaces.length){
                if(i!=spaces[sp]){
                    op.append(s.charAt(i));
                }
                else{
                    op.append(" ");
                    op.append(s.charAt(i));
                    sp++;
                }
            }
            else{
                op.append(s.charAt(i));
            }
        }
        return op.toString();
    }
}