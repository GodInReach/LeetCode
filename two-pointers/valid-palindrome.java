class Solution {
    public boolean isPalindrome(String s) {
        String sp = "";
        for (int i=0; i<s.length(); i++){
            if (Character.isDigit(s.charAt(i))){
                sp+=s.charAt(i);
            }
            else if (Character.isLetter(s.charAt(i))){
                sp+=Character.toLowerCase(s.charAt(i));
            }
        }
        /*
        for (char i : s.toCharArray()){
            if (Character.isDigit(i)){
                sp+=i;
            }
            else if (Character.isLetter(i)){
                sp+=Character.toLowerCase(i);
            }
        }
        */
        int l = sp.length();
        if (l==0){return true;}
        for (int i = 0; i<l; i++){
            if ( ( sp.charAt(i)) == (sp.charAt(l-i-1)) ){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}