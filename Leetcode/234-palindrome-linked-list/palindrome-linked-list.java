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
    public ListNode reverseFrom(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while (curr!=null){
            ListNode nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if (head.next==null)return true;
        ListNode slow=head,fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        fast=reverseFrom(slow.next);
        slow=head;
        while (fast!=null){
            if (slow.val!=fast.val)return false;
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
}