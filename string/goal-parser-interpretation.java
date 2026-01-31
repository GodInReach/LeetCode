class Solution {
    public String interpret(String command) {
        String last = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<command.length(); i++){
            if(command.charAt(i)=='G'){sb.append("G");}
            else if (command.charAt(i)=='('){
                last = "(";
            }
            else if (command.charAt(i)==')'){
                last = "";
                sb.append("o");
            }
            else{
                i+=2;
                sb.append("al");
            }
        }
        return sb.toString();
    }
}