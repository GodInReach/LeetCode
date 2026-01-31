//G!R!
class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        String str = "";
        String vow = "";
        String con = "";
        for (int i = 0; i<s.length(); i++){
            char temp = s.charAt(i);
            if (    temp=='a' || temp=='e'
                 || temp=='i' || temp=='o'
                 || temp=='u' || temp=='A'
                 || temp=='E' || temp=='I'
                 || temp=='O' || temp=='U' )
            {
                con+='¿';
                vow+=temp;
            }
            else{
                con+=temp;
            }
        }
        int ptr = vow.length()-1;
        for (int i = 0; i<s.length(); i++){
            if (con.charAt(i)!='¿'){
                str+=con.charAt(i);
            }
            else{
                str+=vow.charAt(ptr);
                ptr--;
            }
        }
        return str;

    }
}