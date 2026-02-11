class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        int i = 0;
        int j = 1;
        List<Integer> li = new ArrayList<Integer>();
        while(j<height.length){
            if(height[i]>threshold){
                li.add(j);
            }
            i++;
            j++;
        }
        return li;
    }
}