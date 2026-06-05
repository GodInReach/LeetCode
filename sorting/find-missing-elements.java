class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> li = new ArrayList();
        int[] arr = new int[100];
        int min = 100;
        int max = -1;
        for(int i : nums){
            arr[i-1]=1;
            if(min>i-1) min = i-1;
            if(max<i-1) max = i-1;
        }
        for(int i = min; i<=max; i++){
            if(arr[i]==0){
                li.add(i+1);
            }
        }
        return li;
    }
}