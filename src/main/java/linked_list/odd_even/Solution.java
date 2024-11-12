package linked_list.odd_even;

import linked_list.list_node.ListNode;

public class Solution {
  public ListNode oddEvenList(ListNode head) {
    if (head == null) return null;
    ListNode oddNode = head;
    ListNode evenNode = head.next, eventHead = head.next;
    while (evenNode != null && evenNode.next != null) {
        oddNode.next = oddNode.next.next;
        oddNode = oddNode.next;
        evenNode.next = evenNode.next.next;
        evenNode = evenNode.next;
    }
    oddNode.next = eventHead;
    return head;
  }
}
