class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> li = new ArrayList<String>();
        for (int i = 1; i<=n ; i++){
            String temp = "";
            if (i%3 == 0){
                temp+="Fizz";
            }
            if (i%5 == 0){
                temp+="Buzz";
            }
            if (temp==""){
                temp = Integer.toString(i);
            }
            li.add(temp);
        }
        return li;
    }
}