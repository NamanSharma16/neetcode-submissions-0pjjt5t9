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
        if(head == null || (head.next == null && n==1)){
            return null;
        }
        ListNode temp = head;
        int len = 0;
        while(temp !=null){
            len++;
            temp = temp.next;
        }
        temp = head;
        if(len==n){
            return head.next;
        }
        int ctr=len-n-1;

        while(ctr != 0){
            ctr--;
            temp = temp.next;
        }
        //now we have reached pen ultimate node 
        temp.next = temp.next.next;
        return head;
    }
}
