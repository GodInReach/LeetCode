class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        int x = 0;
        int y = s.charAt(0);
        for (int i = 1; i<s.length(); i++){
            x = y - (int)s.charAt(i);
            y = (int)s.charAt(i);
            if(x<0){score+= (-1)*x;}
            else{score+=x;}
        }
        return score;
    }
}