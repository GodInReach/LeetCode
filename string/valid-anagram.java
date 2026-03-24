class Solution {
    public boolean isAnagram(String s, String t) {
        if ( s.length() != t.length() ) return false;
        char[] sc = s.toCharArray();
        Arrays.sort(sc);
        char[] tc = t.toCharArray();
        Arrays.sort(tc);
        String stc = new String(sc);
        String stt = new String(tc);
        if (stc.equals(stt) )return true;
        return false;
    }
}