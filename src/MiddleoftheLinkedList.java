/*
 Day 08

 Given a non-empty, singly linked list with head node head, return a middle node of linked list.

 If there are two middle nodes, return the second middle node.

 Example 1:
    Input: [1,2,3,4,5]
    Output: [3,4,5]
 Example 2:
    Input: [1,2,3,4,5,6]
    Output: [4,5,6]
 */

public class MiddleoftheLinkedList {
    public static void main(String[] args) {
        //String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        //System.out.println(middleNode());
    }

    public static ListNode middleNode(ListNode head) {
        ListNode current = head;
        int index = 0;
        while(current != null) {
            current = current.next;
            index++;
        }

        current = head;
        int stopIndex = (index)/2;
        index = 0;
        while(index != stopIndex) {
            current = current.next;
            index++;
        }

        return current;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
