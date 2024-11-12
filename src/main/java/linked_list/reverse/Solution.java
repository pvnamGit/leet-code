package linked_list.reverse;

import linked_list.list_node.ListNode;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = (prev);
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}
