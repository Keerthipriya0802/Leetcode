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
    public ListNode merge(ListNode a, ListNode b) {
        if(a==null)
        {
            return b;
        }
        if(b==null)
        {
            return a;
        }
        ListNode head = null,tail=null;
        if(a.val<b.val)
        {
            head=tail=a;
            a=a.next;
        }
        else
        {
            head=tail=b;
            b=b.next;
        }
        while(a!=null && b!=null)
        {
            if(a.val<b.val)
            {
                tail.next=a;
                tail=tail.next;
                a=a.next;
            }
            else
            {
                tail.next=b;
                tail=tail.next;
                b=b.next;
            }
        }
        if(a==null)
        {
            tail.next=b;
        }
        if(b==null)
        {
            tail.next=a;
        }
        return head;
        
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head=null;
        for(ListNode list:lists)
        {
            head=merge(head,list);
        }
        return head;
        
    }
}