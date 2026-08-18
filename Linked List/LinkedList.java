/* Linked list (Creation and Addition of nodes) */

public class LinkedList {
public static class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
} 

public Node head;
public Node tail;
public int size;

public void addNodeFirst(int data) {
    // O(1)
    //1. Create a node
    Node node = new Node(data);


    // Check if linked list is empty
    if(this.head == null) {
        this.head = this.tail = node;
        return;
    }

    // rearranging references.
    node.next = head;
    head = node;
    this.size++;
}

public void addLast(int data) {
    // O(1)
    // Creating a new node
    Node newNode = new Node(data);

    //check if list is empty
    if(head == null) {
        head = tail = newNode;
        return;
    }

    // rearranging references
    tail.next = newNode;
    tail = newNode;
    this.size++;
}

public void addMiddle(int index, int data) {
    //O(n)

    int idx = 0;

    if(index < 0 || index > size) {
        System.out.println("Enter correct index please");
        return;
    }

    //create a node
    Node newNode = new Node(data);

    Node currentNode = head;

    if(index == 0) {
        addNodeFirst(data);
        return;
    }

    if(index == size) {
        addLast(data);
        return;
    }

    while(idx < index-1) {
        currentNode = currentNode.next;
        idx++;
    }

    //Insertion
    newNode.next = currentNode.next;
    currentNode.next = newNode;
    this.size++;
}

public void printList() {
    // O(n)
    if(head == null) {
        System.out.println("Linked List is empty");
        return;
    }

    Node current = head;

    while (current != null) {
        System.out.print(current.data + " -> ");
        current = current.next;
    }

    System.out.println("null");
}

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l2.addNodeFirst(887);
        l1.addNodeFirst(10);
        l2.addNodeFirst(255);
        l1.addNodeFirst(55);
        l1.addLast(554);
        l2.addLast(8425);
        l1.addMiddle(2,45);
        l1.printList();
        l2.printList();
      
    }
}