public class sample_linked_list {

public static class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public static class linkedList {
    private Node head;

    public linkedList() {
        this.head = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;

    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "+");
            current = current.next;
        }
        System.out.println("-");
    }
}



public static void main(String[] args) {
    linkedList link = new linkedList();
    link.append(1);
    link.append(2);
    link.append(3);
    link.display();
}
}