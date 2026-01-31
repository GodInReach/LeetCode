class Solution {
    public String reversePrefix(String word, char ch) {
        String rem = "";
        String rev = "";
        int really = 0;
        int found = 0;
        for (char i : word.toCharArray()){
            if( found==0 ){
                if( Character.compare(i,ch)!=0 ){
                    rev+=i;
                }
                else{
                    really=1;
                    found=1;
                    rev+=i;
                }
            }
            else{
                rem+=i;
            }
        }
        if(really==1){
            String sb = new StringBuilder(rev).reverse().toString();
            return sb+rem;
        }
        else{
            return word;
        }
    }
}