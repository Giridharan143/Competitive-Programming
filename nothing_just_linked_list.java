import java.util.Scanner;

public class nothing_just_linked_list {


    public static class Node{
        public int data;
        public Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class linkedList{
        private Node head;
        
        public linkedList(){
            this.head=null;
        }
        public void append(int data){
            Node newNode = new Node(data);
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
        public void display(){
            Node current = head;         // For traversing through the list
            while(current!=null){
                System.out.print(current.data+" -> ");
                current=current.next;            
            }
            System.out.println("Empty !!!");
        }
    }

    public static void main(String[] args) {
        linkedList link = new linkedList();
        /*link.append(1333);
        link.append(13323);
        link.append(13313);
        link.append(1336);*/

        Scanner inp = new Scanner(System.in);
        int num;
        System.out.println("Enter the Number of Elements to be Inserted !!");
        num = inp.nextInt();
        for(int i=0;i<num;i++){
            int temp = inp.nextInt();
            link.append(temp);
        }
        System.out.println("OUTPUT");
        link.display();
        
    }
}