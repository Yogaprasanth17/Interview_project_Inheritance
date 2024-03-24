package LinkedList;

public class LinkedListREC {
    public static void main(String[] args) {
        LinkedListRECR list = new LinkedListRECR();
        for (int i = 1; i <= 5; i++) {
            list.insertAtFirst(i);
        }
        list.insertRec(90, 2);
        list.diplayList();
    }
}
class LinkedListRECR {

    Node head;
    Node tail;
    int size;
    LinkedListRECR() {
        this.size = 0;
    }
    public void diplayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print("["+temp.value+"]" + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void insertRec(int val,int index) {
        head = insertRec(val,index, head);
    }
    public Node insertRec(int val,int index,Node node) {
        if (index == 0) {
            Node temp = new Node(val,node);
            size += 1;
            return temp;
        }
        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }
    // LeetCode Question 83
    public Node deleteDuplicates(Node head) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        return head;
    }
    // https://leetcode.com/problems/merge-two-sorted-lists/
    public Node mergeTwoLists(Node h1, Node h2) {
        Node tempHead = new Node();
        Node tail = tempHead;
        while (h1 != null && h2 != null) {
            if (h1.value < h2.value) {
                tail.next = h1;
                h1 = h1.next;
                tail = tail.next;
            }
            else {
                tail.next = h2;
                h2 = h2.next;
                tail = tail.next;
            }
        }
        tail.next = (h1 == null) ? h2 : h1;
        return tempHead.next;
    }
    class Node {

        int value;
        Node next;
        Node (int value) {
            this.value = value;
        }
        Node (int value,Node next) {
            this.value = value;
            this.next = next;
        }
        public Node() {
        }
    }

}