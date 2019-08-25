package Contest151;


import java.util.ArrayList;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}


public class RemoveZeroSumConsecutiveNodesfromLinkedList {
    public ListNode removeZeroSumSublists(ListNode head) {
        ArrayList<Integer> object = new ArrayList<>();
        while (head.next != null) {
            object.add(head.val);
            head = head.next;
        }
        for (int i = 0; i < object.size(); i++) {
            if (object.get(i) < 0) {
                int total = 0;
                boolean former = false;
                for (int m = i - 1; m >= 0; m--) {
                    total += object.get(m);
                    if (total == object.get(i)) {
                        former = true;
                        i = m;
                        for (int j = 0 ; j < i - m + 1; j++) {
                            object.remove(object.get(m));
                            i--;
                        }
                    }
                }
                if (!former) {

                }
            }
        }
    }
}
