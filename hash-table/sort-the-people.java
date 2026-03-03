class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> mp = new HashMap<Integer,String>();
        for(int i = 0; i<heights.length; i++){
            mp.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] arr = new String[names.length];
        for(int i = names.length-1; i>=0 ; i--){
            arr[names.length-i-1]=mp.get(heights[i]);
        }
        return arr;
    }
}
