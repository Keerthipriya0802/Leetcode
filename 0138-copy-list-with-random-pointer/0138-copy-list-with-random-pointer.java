/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node th = head;
        Map<Node,Node> hm = new HashMap();
        while(th!=null)
        {
            hm.put(th,new Node(th.val));
            th=th.next;
        }
        th=head;
        while(th!=null){
            hm.get(th).next=hm.get(th.next);
            hm.get(th).random=hm.get(th.random);
            th=th.next;
        }
        return hm.get(head);
    }
}