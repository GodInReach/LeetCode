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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null){
            return head;
        }
        int n = 0;
        ListNode temp = head;
        while(temp.next!=null){
            n++;
            temp=temp.next;
        }
        n++;
        int rot = k%n;
        if( n== 1 || rot==0 || k == 0){
            return head;
        }
        ListNode tail = temp;
        ListNode temp2 = head;
        for(int i = 0; i<n-rot-1; i++){
            temp2=temp2.next;
        }
        temp = temp2.next;
        temp2.next = null;
        tail.next = head;
        return temp;

    }
}