class Solution {
    public void reverseString(char[] s) {
       int x=0;
       int y=s.length-1;
       while (x<=y){
        char tmp = s[x];
        s[x]=s[y];
        s[y]=tmp;
        x++;
        y--;
       }

    }
}