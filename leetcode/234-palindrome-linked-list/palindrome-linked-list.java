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
 import java.util.*;
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack <Integer> st= new Stack ();
        ListNode fast=head;
        ListNode slow=head;
        int len=1;
        st.push(head.val);
        while (fast.next!=null &&fast.next.next!=null){
            fast=fast.next.next;
            len+=2;
            slow=slow.next;
            st.push(slow.val);
        }
        if (fast.next!=null)len++;
        if (len%2==1)st.pop();
        slow=slow.next;
        while (slow!=null){
            if (st.isEmpty())return false;
            if (slow.val!=st.pop())return false ;
            slow=slow.next;
        }
        return true;
    }
}