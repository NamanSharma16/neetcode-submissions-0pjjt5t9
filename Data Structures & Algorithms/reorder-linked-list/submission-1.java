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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        //reach middle of LL by slow fast
        ListNode slow = head;
        ListNode fast = slow;
        while(fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        //reverse second half
        ListNode second = reverse(slow.next);
        slow.next = null; // disconnect first half
        //merge both LLs alternatively
        ListNode first = head;
        while(second != null){
            ListNode temp1 = first;
            ListNode temp2 = second;
            first = first.next;
            second = second.next;
            temp1.next = temp2;
            temp2.next = first;
        }
    }

    private ListNode reverse(ListNode curr){
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
