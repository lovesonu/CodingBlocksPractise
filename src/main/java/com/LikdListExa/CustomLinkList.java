package com.LikdListExa;

public class CustomLinkList {

    private Node head;
    private Node tail;
    private int size;

    public Node getHeadNode() {
        return this.head;
    }

    CustomLinkList() {
        head = tail = null;
        size = 0;
    }

    void display() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int display_By_pos(int index, int value) {

        CustomLinkList cs = new CustomLinkList();
        Node newNode = new Node(value);

        if (index > size) {
            cs.insertEnd(value);
        }
        if (index == 0) {
            cs.adFirst(value);
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
            temp.next = newNode;
        }
        System.out.println(" >> : " + temp.next.data);
        System.out.println("data : " + temp.data);
        return temp.data;
    }


    public int sortList() {

        Node temp = head;
        if (head == null) {
            System.out.println("Empty ");
            return -1;
        }
        while (temp != null) {
            System.out.println("YES");
            if (temp.data > temp.next.data) {
                return 0;
            }
            temp = temp.next;
        }
        System.out.println("NO");
        return 1;
    }

//     joohi tech m outside

    boolean searchList(int b) {
        Node current_Ndde = head;
        while (current_Ndde != null) {
            if (current_Ndde.data == b) {
                return true;
            }
            current_Ndde = current_Ndde.next;
        }
        return false;
    }

    void pushNodeEnd(int data) {
        Node new_node = new Node(data);
        new_node.next = tail;
        tail = new_node;
    }

    void firstNode(int data) {
        Node new_Node = new Node(data);
        new_Node.next = head;
        head = new_Node;
    }

    public void insertEnd(int data) {
        // Creating newNode memory & assigning data value
        Node newNode = new Node(data);

        // if Linked List was empty, entering first node
        if (head == null) {
            head = newNode;
            System.out.println(newNode.data + " inserted");
            return;
        }
        // required to traverse the Linked List
        Node temp = head;

        // traverse till the last node in Linked List
        while (temp.next != null)
            temp = temp.next;

        // assigning the current last node's next to this newNode
        // thus newNode becomes the last node in Linked List
        temp.next = newNode;
        System.out.println(newNode.data + " inserted");
    }

    int len() {
        pushNodeEnd(212);
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        System.out.println("Size : " + length);
        return length;
    }

    void adFirst(int data) {
        Node new_Node = new Node(data);
        new_Node.next = head;
        head = new_Node;
        if (size == 0) {
            tail = new_Node;
        }
        size++;
    }


    void adLast(int data) {
        System.out.println("I am at last place");
        Node new_Node = new Node(data);
        if (size == 0) {
            head = tail = new_Node;
        }
        tail.next = new_Node;
        tail = tail.next;
        size++;
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
    }

    void deletLast() {
        System.out.println();
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        while (secondLast.next != null) {
            secondLast = secondLast.next;
            secondLast.next = null;
        }
    }

    public void printREverse(Node A) {
        if (A == null) {
            return;
        }

        printREverse(A.next);
        System.out.print(A.data + " ");
    }
}
