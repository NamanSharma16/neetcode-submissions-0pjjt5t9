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
        if(head.next == null || head.next.next == null) return;
        
        // first count length of linked list
        ListNode t = head; 
        int n = 0; 
        while(t!=null){
            n++;
            t = t.next;
        }

        //re position to head
        t = head;
        //loop till end of first half of list
        for(int i = n; i > n - n/2; i--){
            t = t.next;
        }
        // reverse the second half of list
        ListNode list2 = reverseList(t.next);

        //first half of list end
        t.next = null;

//merge the two parts 
        mergeList(head, list2);
        
    }

    private ListNode reverseList(ListNode head1){
        if(head1.next == null) return head1;
        ListNode prev = null;
        ListNode next = head1;
        while(head1 != null){
            next = head1.next;
            head1.next = prev;
            prev = head1;
            head1 = next;
        }
        return prev;
    }

    private void mergeList(ListNode head, ListNode list2){
        ListNode temp = head;
        ListNode list1 = head;
        while(list1!=null && list2!=null){
            list1 = list1.next;
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
            temp.next = list1;
            temp = temp.next;
        }
    }
}
