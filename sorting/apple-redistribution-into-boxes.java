class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int box = 0;
        int asum = 0;
        for (int i : apple){
            asum+=i;
        }
        Arrays.sort(capacity);
        int i = capacity.length-1;
        while(asum>0){
            asum-=capacity[i];
            i--;
            box++;
        }
        return box;
    }
}