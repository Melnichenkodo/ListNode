package ListNode;


public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public boolean equals(ListNode node) {
        if (this.val == node.val) {
            if (this.next != null) {
                return this.next.equals(node.next);
            }
            return true;
        } else {
            return false;
        }
    }

    public void addNext(ListNode next) {
        this.next = next;
    }
}
