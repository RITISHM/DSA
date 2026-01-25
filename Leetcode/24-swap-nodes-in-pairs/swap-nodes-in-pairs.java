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
    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null)return head;
        ListNode dummy=new ListNode ();
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        while (curr!=null&&curr.next!=null){
            ListNode n=curr.next;
            prev.next=n;
            curr.next=n.next;
            n.next=curr;
            prev=curr;
            curr=curr.next;
        }
        return dummy.next;
    }
}