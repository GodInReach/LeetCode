/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        StringBuilder s = new StringBuilder();
        while(head!=null){
            s.append(head.val);
            head=head.next;
        }
        String nonrev = s.toString();
        return nonrev.equals(s.reverse().toString());
    }
}