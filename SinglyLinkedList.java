public class SinglyLinkedList {
    private ListNode head = null;
    private ListNode tail = null;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(4);
        ListNode four = new ListNode(7);

        sll.head.next = second;
        // sll.deleteAtLast();
        second.next = third;
        third.next = four;
        sll.addNodeAtFirst(1);
        sll.insertLast(10);
        sll.insertLast(10);
        // sll.deleteAtPosition(3);
        sll.deleteAtFirst();
        sll.insert(3, 7);
        sll.deleteAtLast();
        sll.InsertNodeAfter(1, 10);
        sll.insertLast(9);
        // sll.insertAtLastUsingTail(6);

        sll.traverse();

        // find the middle Node
        ListNode middleNode = sll.getMiddleNode();
        System.out.println(middleNode.data);

        // to remove the duplicate node
        sll.removeDuplicate();

        System.out.println("Length is --" + sll.length());

    }

    // To Display the Linked List

    public void traverse() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -->");

            temp = temp.next;
        }
        System.out.println("null");
    }

    // To count the Length the Linked List

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Delete Node from First

    public void deleteAtFirst() {

        if (head == null) {
            System.out.println(" LinkedList is empty");
        } else {
            ListNode temp = head;
            temp = temp.next;
            head = temp;
        }

    }
    // Delete Node from the Last

    public void deleteAtLast() {

        if (head == tail) {
            head = null;
            tail = null;
            System.out.println("LinkedList is empty");
            return;
        } else {
            ListNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void InsertNodeAfter(int nodeElement, int newElement) {

    }
    // Insert Node at First

    public void addNodeAtFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    // Insert Node at Last

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    // Insert Node at Last using Tail

    public void insertAtLastUsingTail(int value) {
        if (head == null) {
            head = new ListNode(value);
        } else {
            ListNode newNode = new ListNode(value);
            tail.next = newNode;
            newNode.next = tail;
            this.tail = null;
        }
    }

    // Delete the Last Node

    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode temp = head;
            ListNode previous = null;
            while (temp.next != null) {
                previous = temp;
                temp = temp.next;
            }
            previous.next = null;
            return temp;
        }
    }

    // Insert Node at any given position --- Very Important

    public void insert(int position, int value) {
        ListNode node = new ListNode(value);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    // Delete a given node at any position

    public void deleteAtPosition(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;

            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    /// To find the middle Node of the linked list
    public ListNode getMiddleNode() {
        if (head == null) {
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    // to find the Nth Node from the End

    public ListNode getNthNodeFromEnd(int n) {
        if (head == null) {
            return null;
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value : n " + n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while (count < n) {
            if (refPtr == null) {
                throw new IllegalArgumentException(n + "is greater than the number of nodes in list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    // To remove duplicate node from the sorted Linkedlist
    public void removeDuplicate() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
}
