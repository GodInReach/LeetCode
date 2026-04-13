class Solution {
    public boolean checkStrings(String s1, String s2) {
        StringBuilder s10 = new StringBuilder();
        StringBuilder s11 = new StringBuilder();
        StringBuilder s20 = new StringBuilder();
        StringBuilder s21 = new StringBuilder();
        for (int i = 0; i<s1.length(); i++){
            if(i%2==0){
                s10.append(s1.charAt(i));
                s20.append(s2.charAt(i));
            }
            else{
                s11.append(s1.charAt(i));
                s21.append(s2.charAt(i));
            }
        }
        char[] a1 = s10.toString().toCharArray();
        char[] a2 = s11.toString().toCharArray();
        char[] b1 = s20.toString().toCharArray();
        char[] b2 = s21.toString().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        Arrays.sort(b1);
        Arrays.sort(b2);
        return Arrays.equals(a1,b1)&&Arrays.equals(a2,b2);
        
    }
}
