class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i<s.length(); i++){
            if (sb1.toString().equals("") && s.charAt(i)=='#'){
                continue;
            }
            else if (s.charAt(i)=='#'){
                sb1.deleteCharAt(sb1.length()-1);
            }
            else{
                sb1.append(s.charAt(i));
            }
        }
        for (int i = 0; i<t.length(); i++){
            if (sb2.toString().equals("") && t.charAt(i)=='#'){
                continue;
            }
            else if (t.charAt(i)=='#'){
                sb2.deleteCharAt(sb2.length()-1);
            }
            else{
                sb2.append(s.charAt(i));
            }
        }
        return (sb1.toString()).equals(sb2.toString());
    }
}