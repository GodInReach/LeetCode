class Solution {
    public int maxFreqSum(String s) {
        int vmax=0;int cmax=0;
        Set<Character> vov = new HashSet<Character>(Arrays.asList('a','e','i','o','u'));
        Map<Character,Integer> mp = new LinkedHashMap<Character,Integer>();
        for(int i = 0; i<s.length(); i++){
            mp.merge(s.charAt(i),1, (x,y) -> (x+y) );
            if(vov.contains(s.charAt(i))){
                if(vmax<mp.get(s.charAt(i))){
                    vmax=mp.get(s.charAt(i));
                }
            }
            else{
                if(cmax<mp.get(s.charAt(i))){
                    cmax=mp.get(s.charAt(i));
                }
            }
        }
        return vmax+cmax;
    }
}