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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode now = head.next;
        ListNode last = head;
        last.next = null;
        while(now!=null){
            head=now.next;
            now.next=last;
            last=now;
            now=head;
        }
        return last;
    }
}