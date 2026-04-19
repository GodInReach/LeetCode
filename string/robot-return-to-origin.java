class Solution {
    public boolean judgeCircle(String m) {
        int ud = 0;
        int lr = 0;
        for (int i = 0; i<m.length(); i++){
            char c = m.charAt(i);
            if(c=='U'){
                ud++;
            }
            else if(c=='D'){
                ud--;
            }
            else if(c=='L'){
                lr++;
            }
            else{
                lr--;
            }
        }
        return (ud==0 && lr==0);
    }
}