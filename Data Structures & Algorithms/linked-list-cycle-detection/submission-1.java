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
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodes=new HashSet<ListNode>();
        ListNode tempNode=head;        
        if(head==null || head.next==null)
           return false;


        while(tempNode!=null){
            if(nodes.contains(tempNode))
               return true;
             nodes.add(tempNode);
             tempNode=tempNode.next;

        }
        return false;


    }
}
