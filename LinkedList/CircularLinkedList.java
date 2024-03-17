package LinkedList;

public class CircularLinkedList {
    public static void main(String[] args) {
        CircularList list = new CircularList();
        for (int i=1;i<=5;i++) {
            list.insert(i);
        }
        list.display();
        list.remove(5);
        list.display();
    }
}
class CircularList {
    Node head;
    Node tail;

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display() {
        Node temp = head;
        if (temp != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("HEAD NODE");
        }
    }
    public void remove(int val) {
        if (head == null) {
            return;
        } 
        Node node = head;
        if (node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node fast = node.next;
            if (fast.value == val) {
                node.next = fast.next;
                break;
            }
            node = node.next;
        } while(node != head);
    }

    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
        Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
