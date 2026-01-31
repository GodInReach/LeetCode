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
import java.math.BigInteger;

class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode thala = head;
        while(thala.next!=null){
            int x = (BigInteger.valueOf(thala.val).gcd(BigInteger.valueOf(thala.next.val))).intValue();
            ListNode neww = new ListNode(x,thala.next);
            thala.next = neww;
            thala = thala.next;
            thala = thala.next;

        }
        return head;
    }
}