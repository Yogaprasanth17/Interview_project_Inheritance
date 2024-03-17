package LinkedList;

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 1; i <= 5; i++) {
            linkedList.insertAtFirst(i);
        }
        linkedList.insertLast(0);
        linkedList.diplayList();
    }
    
}

class LinkedList {

    Node head;
    Node tail;
    int size;
    LinkedList() {
        this.size = 0;
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

    public void diplayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print("["+temp.value+"]" + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void set(int index,int val) {
        if (index == 0) {
            insertAtFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node currNode = getNode(index);
        Node node = new Node(val,currNode.next);
        currNode.next = node;
        size += 1;
    }

    public Node getNode(int index) {
        Node temp = head;
        for (int i=1;i<index;i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size -= 1;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secLastNode = getNode(size);
        int ans = tail.value;
        tail = secLastNode;
        tail.next = null;
        size -= 1;
        return ans; 
    }

    public int remove(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prevNode = getNode(index);
        int ans = prevNode.next.value;
        prevNode.next = prevNode.next.next;
        size -= 1;
        return ans;
    }
    public Node find(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    // "also valid"
    // public void set(int index,int val) {
        // if (index == 0) {
        //     insertAtFirst(val);
        //     return;
        // }
        // if (index == size - 1) {
        //     insertLast(val);
        //     return;
        // }
    //     Node temp = head;
    //     int i = 1; // i = 1 because when the temp is = head that means temp is at 0'th index
    //     while (i < index) {
    //         temp = temp.next;
    //         i++;
    //     }
    //     /* the commented line are valid it can use when we are not using the constractor to point the Node*/
    //     // Node tempNode = temp.next;
    //     // Node node = new Node(val);
    //     Node node = new Node(val,temp.next);
    //     temp.next = node;
    //     // node.next = tempNode;
    //     size += 1;
    // }

    

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
    }

}