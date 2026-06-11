class Solution {
    public int trap(int[] height) {
        int l = height.length;
        int[] left = new int[l+1];
        int[] right = new int[l+1];
        int tot = 0;
        left[0]=height[0];
        for(int i = 1; i<l; i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        right[l-1]=height[l-1];
        for(int i = l-2; i>=0; i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        for(int i = 0; i<l; i++){
            tot+=Math.min(left[i],right[i])-height[i];
        }
        return tot;
    }
}