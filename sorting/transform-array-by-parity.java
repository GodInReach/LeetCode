class Solution {
    public int[] transformArray(int[] nums) {
        List<Integer> li = new LinkedList<Integer>();
        for(int i: nums){
            if(i%2==0){
                li.add(0,0);
            }
            else{
                li.add(1);
            }
        }
        return li.stream().mapToInt(Integer::intValue).toArray();
    }
}