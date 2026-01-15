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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int sum=0;
    ListNode curr1=l1;
    ListNode curr2=l2;
    ListNode head3=new ListNode();
    ListNode curr3=head3;
     while (curr1 !=null||curr2!=null||sum!=0){
         int a=0,b=0;
         ListNode newNode =new ListNode ();
         if (curr1!=null){
             a=curr1.val;
             curr1=curr1.next;
         }
         if (curr2!=null){
             b=curr2.val;
             curr2=curr2.next;
         }
         sum+=(a+b);
         newNode.val=sum%10;
         sum/=10;
         curr3.next=newNode ;
         curr3=curr3.next;
     }
     System.gc();
      return head3.next;
        
    }
}