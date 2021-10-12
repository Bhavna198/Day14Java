package com.bridgelabz;

public class UC1LinkedList<T> {
    CreatingNode<T> head;
    CreatingNode<T> tail;

    public UC1LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * UseCase 1
     * Lets create a
     * simple Linked List
     * of 56, 30 and 70
     *
     * @param data
     */
    public void create(T data) {
        CreatingNode<T> newNode = new CreatingNode<T>(data);
        if (tail == null && head == null) {
            tail = newNode;
            head = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    /**
     * UseCase 2
     * Now Adding the data By creating Linked List
     * Using the add function to add the elements in Linked List
     */

    public void add(T data) {
        //Create a new node
        CreatingNode<T> newNode = new CreatingNode<T>(data);

        //Checks if the list is empty
        if (head == null && tail == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            //Node temp will point to head
            CreatingNode temp = head;
            head = newNode;
        }
    }

    /**
     * UseCase 3
     * Appending the data in LinkedList
     *
     * @param data
     */

    public void append(T data) {
        CreatingNode<T> newNode = new CreatingNode<T>(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    /**
     * UseCase 4
     * Insert the elements in between the data
     * Then Make Final Sequence 56>30>70
     */

    public void insertInBetween(T newKey, T key) {
        CreatingNode<T> node = head;
        CreatingNode<T> temp;
        CreatingNode<T> newNode = new CreatingNode<T>(newKey);
        while (node != null) {
            if (node.getData() == key) {

            }
            node = node.getNext();
        }
        temp = node.getNext();
        node.setNext(newNode);
        newNode.setNext(temp);
    }

    /**
     * UseCase 5
     * Ability to delete the first element in LinkedList
     */
    public void pop() {
        CreatingNode<T> node = head;
        head = node.getNext();
        node.setNext(null);
    }

    /**
     * UseCase 6
     * Ability to delete the last element from the given sequence.
     */
    public void popLast() {
        CreatingNode<T> node = head;
        while (node.getNext() != tail) {
            node = node.getNext();
        }
        node.setNext(null);
        tail = node;
    }

    /**
     * UseCase 7
     * Ability to search LinkedList to find the node of some certain value
     */
    public boolean SearchInALinkedList(T value) {
        CreatingNode<T> node = head;
        while (node != null) {
            if (node.getData() == value)
                return true;
            node = node.getNext();
        }
        return false;
    }

    /**
     * UseCase 8
     * Ability to insert number after given value to the LinkedList sequence
     */
    public void insert_New_Element(T newKey, T key) {
        CreatingNode<T> node = head;
        CreatingNode<T> temp;
        CreatingNode<T> newNode = new CreatingNode<T>(newKey);
        while (node != null) {
            if (node.getData() == key)
                break;
            node = node.getNext();
        }
        temp = node.getNext();
        node.setNext(newNode);
        newNode.setNext(temp);
    }

    /**
     * UseCase 9
     * Ability to delete element from linked list sequence
     */
    public void delete_Value(T key) {
        CreatingNode<T> node = head;
        CreatingNode<T> prev = null;
        while (node != null) {
            if (node.getData() == key)
                break;
            prev = node;
            node = node.getNext();
        }
        if (prev == null) {
            head = head.getNext();
        } else {
            prev.setNext(node.getNext());
            node.setNext(null);
        }
    }

    /**
     * UseCase 10
     * Ability to create Ordered Linked List in ascending order
     */
    public void OrderedLinkedList(T data) {
        CreatingNode<T> newNode = new CreatingNode<T>(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            CreatingNode<T> temp = null, prev = null;
            temp = head;
            while (temp != null) {
                if (sort(temp, newNode) > 0) {
                    break;
                }
                prev = temp;
                temp = temp.getNext();
            }
            if (temp == head) {
                newNode.setNext(temp);
                head = newNode;
            } else if (temp == null) {
                prev.setNext(newNode);
                tail = newNode;
            } else {
                prev.setNext(newNode);
                newNode.setNext(temp);
            }
        }
    }

    private int sort(CreatingNode<T> temp, CreatingNode<T> newNode) {
        return ((Comparable) temp.getData()).compareTo(newNode.getData());
    }

    public void display() {
        CreatingNode<T> node = head;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }

    public int size() {
        int size = 0;
        CreatingNode<T> node = head;
        while (node != null) {
            size++;
            node = node.getNext();
        }
        return size;
    }
}

