class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int a = 0;
        int b = 1;
        int md = Integer.MAX_VALUE;
        List<List<Integer>> li = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        while(b<arr.length){
            int abs = Math.abs(arr[a]-arr[b]);
            if(abs<md){
                md = abs;
                li.clear();
                li.add(new ArrayList(Arrays.asList(arr[a],arr[b])));
            }
            else if(abs==md){
                li.add(new ArrayList(Arrays.asList(arr[a],arr[b])));
            }
            a++;b++;
        }
        return li;
    }
}