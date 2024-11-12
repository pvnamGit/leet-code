package linked_list.delete_mid_ele;

import linked_list.list_node.ListNode;

public class Solution {
  public ListNode deleteMiddle(ListNode head) {
    if (head == null || head.next == null) return null;

    int size = 0;
    ListNode current = head;
    while (current != null) {
      size++;
      current = current.next;
    }
    int mid = size / 2;
    if (size == 0) return head.next;

    current = head;
    for (int index = 0; index < mid - 1; index++) {
      current = current.next;
      System.out.println(current);
    }

    current.next = current.next.next;

    return head;
  }
}
