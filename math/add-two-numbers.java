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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode op = new ListNode();
        ListNode head = op;
        int rem = 0;
        while(l1!=null || l2!=null){
            int a = (l1!=null) ? l1.v…  sum-=10;
                rem = 1;
            }
            else{
                rem = 0;
            }
            ListNode newNode = new ListNode(sum);
            head.next = newNode;
            head=head.next;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        if(rem!=0){
            ListNode temp = new ListNode(rem);
            head.next=temp;
        }
        return op.next;
    }
}