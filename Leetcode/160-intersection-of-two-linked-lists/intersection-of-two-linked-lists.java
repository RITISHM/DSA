/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0,l2=0;
        ListNode L1=headA,L2=headB;
        while(L1!=null||L2!=null){
            if(L1!=null){
                l1++;
                L1=L1.next;
            }
            if(L2!=null){
                l2++;
                L2=L2.next;
            }
        }
        L1=headA;L2=headB;
        if(l1>l2){
            int steps=l1-l2;

            for (int i=0;i<steps;i++){
                L1=L1.next;
            }
        }
        if(l2>l1){
            int steps=l2-l1;

            for (int i=0;i<steps;i++){
                L2=L2.next;
            }
        }
        while (L1!=null){
            if (L1==L2){
                return L1;
            }
            L1=L1.next;
            L2=L2.next;
        }
        return null;
    }
}