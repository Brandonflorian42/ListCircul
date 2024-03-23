package edu.umg;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class DetectarCiclo {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    public static void main(String[] args) {

        ListNode head1 = new ListNode(3);
        ListNode second1 = new ListNode(2);
        ListNode third1 = new ListNode(0);
        ListNode fourth1 = new ListNode(-4);
        head1.next = second1;
        second1.next = third1;
        third1.next = fourth1;
        fourth1.next = second1;

        ListNode head2 = new ListNode(1);
        ListNode second2 = new ListNode(2);
        head2.next = second2;

        ListNode head3 = new ListNode(1);
        DetectarCiclo detector = new DetectarCiclo();
        System.out.println(detector.hasCycle(head1));
        System.out.println(detector.hasCycle(head2));
        System.out.println(detector.hasCycle(head3));
    }
}
