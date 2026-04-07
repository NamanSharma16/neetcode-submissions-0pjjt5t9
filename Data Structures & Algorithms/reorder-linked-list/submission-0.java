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
        
        ArrayList<Integer> nums = new ArrayList();
        ListNode temp = head;
        while(temp !=null){
            nums.add(temp.val);
            temp = temp.next;
        }
        ArrayList<Integer> newList = rearrange(nums);
        temp = head;
        for(int i = 0; i<newList.size(); i++){
            temp.val = newList.get(i);
            temp = temp.next;
        }
    
    }
    private ArrayList<Integer> rearrange(ArrayList<Integer> nums){
        int n = nums.size();
        ArrayList<Integer> rearr = new ArrayList<>();

        int left = 0, right = n - 1;
        while( left <= right ){
           if(left == right){
            rearr.add(nums.get(left));
           } else {
            rearr.add(nums.get(left));
            rearr.add(nums.get(right));
           }
           left++; right--;
        }
        return rearr;
    }
}
