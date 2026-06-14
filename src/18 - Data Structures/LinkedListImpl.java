public class LinkedListImpl {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class MyLinkedList {
        Node head;
        int size;
        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            size++;
        }

        void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
        }

        void addAt(int index, int data) {
            if (index < 0 || index > size) throw new IndexOutOfBoundsException();
            if (index == 0) { addFirst(data); return; }
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) temp = temp.next;
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
        void delete(int data) {
            if (head == null) return;
            if (head.data == data) { head = head.next; size--; return; }
            Node temp = head;
            while (temp.next != null && temp.next.data != data) {
                temp = temp.next;
            }
            if (temp.next != null) { temp.next = temp.next.next; size--; }
        }

        boolean search(int data) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == data) return true;
                temp = temp.next;
            }
            return false;
        }

        void reverse() {
            Node prev = null, curr = head, next = null;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }
        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.next != null) System.out.print(" → ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.print(); 

        list.addFirst(5);
        list.print(); 

        list.addAt(2, 15);
        list.print(); 

        list.delete(15);
        list.print(); 

        System.out.println("Search 20: " + list.search(20));
        System.out.println("Search 99: " + list.search(99));

        list.reverse();
        list.print(); 

        System.out.println("Size: " + list.size);
    }
}
