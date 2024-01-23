/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode current=node;
        int x=node.next.val;
        ListNode temp=current.next;
        current.val=x;
        current.next=temp.next;
    }
}