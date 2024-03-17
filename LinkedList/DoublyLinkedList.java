package LinkedList;

import MathDSA.power;

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyList doubleList = new DoublyList();
        for (int i = 1; i <= 5; i++) {
            doubleList.addFirst(i);
        }
        // doubleList.insertLast(100);
        // doubleList.insert(99,0);
        // doubleList.insertAfter(1, 96);
        // doubleList.remove(2);
        System.out.println(doubleList.deleteLast());
        doubleList.display();
    }
}


class DoublyList {

    Node head;
    int size;

    DoublyList() {
        this.size = 0;
    }

    public void addFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size += 1;
    }
    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print("["+temp.value+"]" + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("Printing Reverse");
        while (last != null) {
            System.out.print("["+last.value+"]" + " -> ");
            last = last.prev;
        }
        System.out.println("START");

    }
    public void insertLast(int value) {
        Node node = new Node(value);
        Node lastNode = head;
        node.next = null;
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = node;
        node.prev = lastNode;
    }
    public void insert(int value,int index) {
        if (index == 0) {
            addFirst(value);
            return;
        }
        Node prevNode = get(index);
        Node node = new Node(value,prevNode.next);
        if (prevNode.next != null) {
            prevNode.next.prev = node;
        }
        prevNode.next = node;
        node.prev = prevNode;
    }
    public Node get(int index) {
        Node temp = head;
        for (int i=1;i<index;i++) {
            temp = temp.next;
        }
        return temp;
    }
    public Node find(int after) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == after) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    public void insertAfter(int after,int value) {
        Node prevNode = find(after);
        if (prevNode == null) {
            System.out.println("Does not exits");
            return;
        }
        Node node = new Node(value,prevNode.next);
        prevNode.next = node;
        node.prev = prevNode;
        if (node.next != null) {
            node.next.prev = node;
        }
    } 
    public int remove(int index) {
        Node preNode = get(index);
        int val = preNode.next.value;
        preNode.next = preNode.next.next;
        preNode.next.prev = preNode;
        return val;
    }
    public int deleteFirst() {
        if (head == null) {
            return 0;
        }
        int val = head.value;
        head = head.next;
        head.prev = null;
        return val;
    }
    public int deleteLast() {
        if (head == null) {
            return 0;
        }
        int val;
        Node tempNode = head;
        Node lastNode = null;
        while (tempNode.next != null) {
            lastNode = tempNode;
            tempNode = tempNode.next;
        }
        val = lastNode.next.value;
        lastNode.next = null;
        return val;
    }
    class Node {
        int value;
        Node next;
        Node prev;
        Node(int value) {
            this.value = value;
        }
        Node (int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }

}