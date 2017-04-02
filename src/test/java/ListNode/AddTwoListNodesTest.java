package ListNode;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static ListNode.Task2.addTwoNumbers;
import static org.testng.Assert.assertTrue;

public class AddTwoListNodesTest {

    @DataProvider(name = "test1")
    public static Object[][] dataForTest() {
        return new Object[][]{
                {new int[]{5, 9, 9, 9}, new int[]{5}, new int[]{0, 0, 0, 0, 1}},
                {new int[]{2, 4, 3}, new int[]{4, 6, 4}, new int[]{6, 0, 8}},
                {new int[]{2, 4}, new int[]{4, 6, 4}, new int[]{6, 0, 5}},
                {new int[]{1, 8}, new int[]{0, 0}, new int[]{1, 8}},
                {new int[]{1}, new int[]{9}, new int[]{0, 1}},

        };
    }


    @Test(dataProvider = "test1")
    public void testAddTwoListNodes(int[] values1, int[] values2, int[] expectedNum) {

        ListNode l1 = createNestedListNode(values1);
        ListNode l2 = createNestedListNode(values2);
        ListNode expectedNode = createNestedListNode(expectedNum);

        ListNode l3 = addTwoNumbers(l1, l2);

        assertTrue(expectedNode.equals(l3));
    }

    private ListNode createNestedListNode(int[] values) {
        ListNode[] listNodes = new ListNode[values.length];
        for (int i = 0; i < values.length; i++) {
            listNodes[i] = new ListNode(values[i]);
        }
        for (int i = listNodes.length - 1; i != -1; i--) {
            if (i == listNodes.length - 1) {
            } else {
                listNodes[i].addNext(listNodes[i + 1]);
            }
        }
        return listNodes[0];
    }
}
