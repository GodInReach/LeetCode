class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        var mp = new HashMap<Integer,Integer>();
        int[] arr = nums.clone();
        Arrays.sort(arr);
        for (int i = 0 ; i<arr.length ; i++){
            mp.putIfAbsent(arr[i],i);
        }
        int[] op = new int[nums.length];
        for (int i = 0 ; i<nums.length ; i++){
            op[i] = mp.get(nums[i]);
        }
    return op;
    }

}
