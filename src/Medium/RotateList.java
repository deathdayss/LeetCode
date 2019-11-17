package Medium;

import java.util.ArrayList;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ArrayList<Integer> result = new ArrayList<>();
        int length = 0;
        ListNode tem = head;
        while (tem != null) {
            length++;
            result.add(tem.val);
            tem = tem.next;
        }
        int should = k % length;
        if (should == 0) {
            return head;
        }
        ListNode mine = new ListNode(result.get(result.size() - should));
        ListNode first = mine;
        for (int i = result.size() - should + 1; i < result.size(); i++) {
            mine.next = new ListNode(result.get(i));
            mine = mine.next;
        }
        for (int i = 0; i < result.size() - should; i++) {
            mine.next = new ListNode(result.get(i));
            mine = mine.next;
        }
        return first;
    }

    public static void main(String[] args) {
        RotateList a = new RotateList();

    }
}
