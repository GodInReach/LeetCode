class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] saw = new int[nums.length+1];
        List<Integer> lst = new ArrayList<Integer>();
        for (int i : nums){
            saw[i]=1;
        }
        for (int i = 1; i<saw.length; i++){
            if (saw[i]==0){
                lst.add(i);
            }
        }
        return lst;
    }
}