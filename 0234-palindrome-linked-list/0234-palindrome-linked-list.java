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
    ListNode findMidPoint(ListNode head)
    {
        ListNode slow = head , fast = head;
        while(fast!=null)
        {
            fast=fast.next;
            if(fast!=null)
            {
                fast=fast.next;
                slow=slow.next;
            }

        }
        return slow;
    }
    ListNode reverse(ListNode head)
    {
        ListNode prev = null,curr=head,nn=null;
        while(curr!=null)
        {
            nn=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nn;
        }
        return prev;
    }
    boolean compare(ListNode head1,ListNode head2)
    {
        while(head2!=null)
        {
            if(head1.val!=head2.val)
            {
                return false;
            }
            head1=head1.next;
            head2=head2.next;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode secondHead = findMidPoint(head);
        secondHead=reverse(secondHead);
        boolean res=compare(head,secondHead);
        return res;

    }
}