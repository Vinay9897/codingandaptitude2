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
        second.next = third;
        third.next = four;
        sll.addNodeAtFirst(1);
        sll.insertLast(10);
        sll.deleteAtFirst();
        sll.deleteAtLast();
        sll.InsertNodeAfter(1, 10);
        sll.insertLast(9);

        sll.traverse();
        System.out.println("Length is --" + sll.length());

    }

    public void traverse() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -->");

            temp = temp.next;
        }
        System.out.println("null");
    }

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

    public void deleteAtFirst() {

        if (head == null) {
            System.out.println(" LinkedList is empty");
        } else {
            ListNode temp = head;
            temp = temp.next;
            head = temp;
        }

    }

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

    public void addNodeAtFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

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
}
