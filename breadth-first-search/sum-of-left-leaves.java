/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Stack<TreeNode> st = new Stack<TreeNode>();
    int func(TreeNode head){
        int sum = 0;
        while(head!=null){
            if(head.left != null && head.left.left == null && head.left.right == null){
                sum+=head.left.val;
            }
            if(head.right != null){
                st.push(head.right);
            }
            head = head.left;
        }
        return sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        st.clear();
        int sum = 0;
        TreeNode temp = root;
        TreeNode head = root;
        if (root == null){
            return 0;
        }
        sum+=func(head);
        while(!st.isEmpty()){
            temp = st.peek();
            st.pop();
            sum+=func(temp);

        }
        return sum;
    }
}
