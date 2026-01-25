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
        if (head==null||head.next==null)return head;
        ListNode fast=head;
        while (fast.next!=null)fast=fast.next;
        fast.next=head;
        ListNode slow=fast;
        fast=head;
        for (int i=0;i<k;i++)fast=fast.next;
        while (fast!=head){
            fast=fast.next;
            slow=slow.next;
        }
        head=slow.next;
        slow.next=null;
        return head;
    }
}