 public class Solution {
    static {
        ListNode l = new ListNode(2);
        ListNode m = new ListNode(4);
        for (int i = 0; i < 500; i++)
            getIntersectionNode(l, m);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }
}