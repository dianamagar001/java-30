// import java.util.LinkedList;
import java.util.Scanner;

// import org.w3c.dom.Node;

public class LinkedListimpl {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int _data ){
         this.data=_data;
          this.next=null;
        }
    }

    // 1:insert at beginning 
    public void insertAtBeginning(int element){
        Node newNode=new Node(element);
        newNode.next=head;
        head=newNode;
    }
    //2: insert at end
    public void insertAtEnd(int element){
        Node newNode=new Node(element);
        if(head == null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    //3: traverse
public void traverse(){
    if(head == null){
        System.out.println("Linked list is empty");
        return;
    }
    Node temp=head;
    System.out.println("Linked list elements:");
    while(temp != null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
}
   
    public static void main(String args[]){
        LinkedListimpl linkedList=new LinkedListimpl();
        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("============LINKEDLISTED MENU============");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Traverse");
            System.out.println("4. Size");
            System.out.println("5. Search for and element");
            System.out.println("6. Delete from beginning");
            System.out.println("7. Delete from end");
            System.out.println("8. Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the element to insert at beginning: ");
            
                    linkedList.insertAtBeginning(sc.nextInt());
                    break;
                    case 3:
                    linkedList.traverse();
                    break;
}    }
    
    }
}


