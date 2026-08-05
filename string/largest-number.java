class Solution {
    public String largestNumber(int[] nums) {
        String[] snum = new String[nums.length];
        for(int i = 0; i<nums.length; i++){
            snum[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(snum,(a,b)->{
            return -((a+b).compareTo(b+a));
        });
        if(snum[0].startsWith("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for(String i : snum){
            sb.append(i);
        }
        return sb.toString();
    }
}