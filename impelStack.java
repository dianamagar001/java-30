class Node{
    int data;
    Node next;
    Node(int data ){
        this.data=data;
        this.next=null;
    

    }
}


public class impelStack {
   static Node top=null;
   
   //Algorithm for PUSH Operation
   public void push(int element){
    Node newNode=new Node((element));

    //new node points to the current top
    newNode.next=top;


    //new node points to the curent top
    top=newNode;
    System.out.println("pushed element:"+ element);

   }

   public static void main(String[] args) {
    impelStack stack= new impelStack();
    stack.push(50);


    int poppedElement=stack.pop();
    System.out.println("popped element is:"+poppedElement);
   }

}  

