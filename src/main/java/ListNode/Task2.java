package ListNode;


public class Task2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int newVal = l1.val + l2.val;
        int addNextVal = 0;
        if (newVal >= 10) {
            newVal -= 10;
            addNextVal = 1;
        }
        ListNode result = new ListNode(newVal);
        ListNode next1 = l1.next;
        ListNode next2 = l2.next;
        if (next1 != null || next2 != null || addNextVal != 0) {
            if (next1 == null) {
                next1 = new ListNode(0);
            }
            if (next2 == null) {
                next2 = new ListNode(0);
            }
            next1.val += addNextVal;
            result.next = addTwoNumbers(next1, next2);
        }
        return result;
    }

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode l3 = addTwoNumbers(l1, l2);

        printResult(l3);

    }

    private static void printResult(ListNode result) {
        System.out.println(result.val);
        if (result.next != null) {
            printResult(result.next);
        }
    }
}
