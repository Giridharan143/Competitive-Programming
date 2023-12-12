public class nothing_just_linked_list {


public static class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public static class linkedList{ //class is small c
    private Node head;

    public linkedList(){
        this.head = null;
    }

    public void append(int data){
        Node newNode = new Node(data); // Check this area be careful for getting the input of the data
        if(head==null){
            head=newNode;            
        }
        else{
        Node last = head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newNode;        
    }
}
    public void Display(){
        Node current = head;
        while (current!=null) {  // Check this line too becareful
            System.out.println(current.data+" ->");
            current=current.next;
        }    
        System.out.println("End of the List\nSayanora");
    }

}

    public static void main(String[] args) {
        linkedList link = new linkedList();
        link.append(0);
        link.append(1);
        link.append(2);
        link.Display();
    }
    
}
