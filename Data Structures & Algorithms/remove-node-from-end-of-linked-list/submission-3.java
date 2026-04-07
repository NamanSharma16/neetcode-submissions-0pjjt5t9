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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp=temp.next;
        }
        temp = head;
        if(len == n) return head.next;

        len = len - n ;
        while(len>1){
            temp = temp.next;
            len--;
        }

        //reached (sz-n)th node from front i.e. n+1 th node from back

        temp.next = temp.next.next;

        return head;
    }
}
