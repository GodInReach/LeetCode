//G!R!
class Solution {
    public String addBinary(String a, String b) {
        char carry = '0';
        String rem = "";
        int temp = 0;
        int len;
        int small;
        String who;
        String rem2 = "";

        if(a.length() > b.length()){
            len = a.length();
            small = b.length();
            who = "b";
        }else{
            len = b.length();
            small = a.length();
            who = "a";
        }

        for(int i = len-1; i>=0; i--){
            int bitA = 0, bitB = 0;
            if(i >= len - a.length()){
                bitA = a.charAt(a.length() - (len - i)) - '0';
            }
            if(i >= len - b.length()){
                bitB = b.charAt(b.length() - (len - i)) - '0';
            }
            temp = (carry - '0') + bitA + bitB;
            if(temp == 0){
                rem += '0';
                carry = '0';
            }else if(temp == 1){
                rem += '1';
                carry = '0';
            }else if(temp == 2){
                rem += '0';
                carry = '1';
            }else{
                rem += '1';
                carry = '1';
            }
        }

        for(int i = rem.length()-1; i>=0; i--){
            rem2 += rem.charAt(i);
        }

        return (carry == '1' ? "1" : "") + rem2;
    }
}