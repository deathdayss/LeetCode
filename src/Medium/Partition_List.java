package Medium;

import java.util.List;

public class Partition_List {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode bigTail = null;
        ListNode bigHead = null;
        ListNode smallTail = null;
        ListNode smallHead = null;
        ListNode find = head;
        while (find != null) {
            if (find.val >= x) {
                System.out.println("Big is " + find.val);
                if (bigHead == null) {
                    bigHead = new ListNode(find.val);
                    bigTail = bigHead;
                } else {
                    bigTail.next = new ListNode(find.val);
                    bigTail = bigTail.next;
                }
            } else {
                System.out.println("Small is " + find.val);
                if (smallHead == null) {
                    smallHead = new ListNode(find.val);
                    smallTail = smallHead;
                } else {
                    smallTail.next = new ListNode(find.val);
                    smallTail = smallTail.next;
                }
            }
            find = find.next;
        }
        if (smallTail == null) {
            return bigHead;
        } else {
            smallTail.next = bigHead;
            return smallHead;
        }
    }
}
