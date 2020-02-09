package Medium;

public class Add_Two_Numbers {

    public ListNode plusOne(ListNode tar) {
        ListNode seek = tar;
        int addIt = 1;
        if (seek == null) {
            return new ListNode(1);
        }
        seek.val += addIt;
        if (seek.val >= 10) {
            seek.val -= 10;
        } else {
            addIt = 0;
        }
        while (seek.next != null) {
            seek.next.val += addIt;
            addIt = 0;
            if (seek.next.val >= 10) {
                seek.next.val -= 10;
                addIt = 1;
            }
            seek = seek.next;
        }
        if (addIt == 1) {
            seek.next = new ListNode(1);
        }
        return tar;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fst = l1;
        ListNode snd = l2;
        if (fst == null) {
            return snd;
        }
        if (snd == null) {
            return fst;
        }
        int addIt = 0;
        int get = fst.val + snd.val;
        if (get >= 10) {
            get -= 10;
            addIt = 1;
        }
        fst.val = get;
        while (fst.next != null && snd.next != null) {
            int and = fst.next.val + snd.next.val + addIt;
            if (and >= 10) {
                addIt = 1;
                and -= 10;
            } else {
                addIt = 0;
            }
            fst.next.val = and;
            fst = fst.next;
            snd = snd.next;
        }
        if (fst.next == null) {
            if (addIt == 1) {
                snd.next = plusOne(snd.next);
            }
            fst.next = snd.next;
        }
        if (snd.next == null) {
            if (addIt == 1) {
                fst.next = plusOne(fst.next);
            }
            snd.next = fst.next;
        }
        return l1;
    }

    public static void main(String[] args) {
        Add_Two_Numbers a = new Add_Two_Numbers();
        ListNode l1 = new ListNode(8);
        ListNode l2 = new ListNode(9);
        ListNode l3 = new ListNode(9);
        l1.next = l2;
        l2.next = l3;
        ListNode l4 = new ListNode(2);
        a.addTwoNumbers(l1,l4);
    }
}
