package Medium;

public class Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        ListNode first = head;
        while(head != null) {
            int mid = head.val;
            if (head.next == null) {
                break;
            }
            head.val = head.next.val;
            head.next.val = mid;
            head = head.next.next;
        }
        return first;
    }
}
