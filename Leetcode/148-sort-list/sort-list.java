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
        public ListNode mergeList(ListNode left,ListNode right){
            ListNode temp=new ListNode();
            ListNode cur= temp;
            while(left!=null&&right!=null){
                if (left.val<right.val){
                    cur.next=left;
                    left=left.next;
                    cur=cur.next;
                    }
                else{
                    cur.next=right;
                    right=right.next;
                    cur=cur.next;
                } 
            }
            if (right ==null)cur.next=left;
            else cur.next=right;
            return temp.next;
        }
        public ListNode findMiddle (ListNode node){
            if(node ==null||node.next==null)return node;
            ListNode slow=node;
            ListNode fast=node;
            while (fast.next!=null&&fast.next.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
        }
    public ListNode sortList(ListNode head) {
        if(head==null|| head.next==null)return head;
        ListNode middle=findMiddle(head);
        ListNode left=head;
        ListNode right=middle.next;
        middle.next=null;
        left=sortList(left);
        right =sortList(right);
        head=mergeList(left,right);
        return head;
    }
}