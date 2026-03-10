import java.util.Scanner;

public class LinkedListimpl2 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int _data ){
         this.data=_data;
          this.next=null;
        }

    
}
//insert at the beginning
 public void insertAtBeginning(int element){
        Node newNode=new Node(element);
        newNode.next=head;
        head=newNode;
    }
    //insert at the end
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
    //traverse
public void traverse(){
    if(head == null){
        System.out.println("Linked list is empty");
        return;
    }
    Node temp=head;
    System.out.println("Linked list elements:");
    while(temp != null){
        System.out.print(temp.data + " ");
        temp=temp.next;
    }
}
//size
public int size(){
    int count=0;
    Node temp=head;
    while(temp != null){
        count=count+1;
        temp=temp.next;
    }
    return count;
}

//search for an element
public boolean search(int element){
    Node temp=head;
    
    while(temp != null){
        if(temp.data == element){
            return true;
        }
        temp=temp.next;
        
    }
    return false;
}
//delete from beginning
public void deleteFromBeginning(){
    if(head == null){
        System.out.println("Linked list is empty");
        return ;

    }
    head=head.next;
    return;
}

//delete from end
public void deleteFromEnd(){
    if(head == null){
        System.out.println("Linked list is empty");
        return ;
    }
    if(head.next == null){
        head=null;
        return;
    }
    Node temp=head;
    while(temp.next.next != null){
        temp=temp.next;
    }
    temp.next=null;
    return;
}
public static void main(String args[]){
    LinkedListimpl2 linkedList=new LinkedListimpl2();
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
                    case 4;
                    System.out.println("size");


}
}
}
}
