import java.util.Scanner;

public class Queue {
    static int N =10;//maximum size of a queue
    static int[] queue = new int[N];
    static int F=-1;
    static int R=-1;

    //method to check is the queue is full
public static boolean isFull(){
    if ( R==N-1) {
        return true;
        
    }else{
        return false;
    }
}


        
    
//method to check is the queue is empty
public static boolean isEmpty(){
    if (F==R) {
        return true;
        
    }else{
        return false;
    }
}


/**
 * ENQUEUE OPERATION
 * LOGIC:IF(ISFULL()) WRITE OVERFLOW
 */

public static void enqueue(int ITEM){
    if(isFull()){
        System.out.println ("overflow :queue is full");
        return;
    }
    //check if it  is first element.
    if (F==-1) {
        F=0;
        R=0;
        
        
    }else{
    R=R+1;
    }
    queue[R]=ITEM;
    System.out.println(ITEM+" is inserted in the queue");
}
//DEQUEUE OPERATION
public static void dequeue(){
    if (isEmpty()) {
        System.out.println("underflow :queue is empty");
        return;
        
    }
    int ITEM=queue[F];
    if (F==R) {
        F=-1;
        R=-1;
    }else{}
    F=F+1;
    System.out.println(ITEM+" is removed from the queue");

    
}
//to display the dequeue operation
public static void main(String[] args) {
    

Scanner sc = new Scanner(System.in);
int choice;
choice=0;
while(true){
    System.out.println("1. is empty");
    System.out.println("2. is full");
    System.out.println("3. enqueue");
    System.out.println("4. dequeue");
    System.out.println("5. display");
    System.out.println("6. exit");
    choice=sc.nextInt();
     switch ((choice)) {
        case 1:
            System.out.println("queue is empty: "+isEmpty());
            
            break;
        case 2:
            System.out.println("queue is full: "+isFull());
            break;
        case 3:
            System.out.println("enter the item to be inserted");
            int ITEM=sc.nextInt();
            enqueue(ITEM);
            break;
        case 4:
            dequeue();
            break;
        case 5:
            if (isEmpty()) {
                System.out.println("queue is empty");
                break;
                
            }
            System.out.println("elements in the queue are:");
            for (int i = F; i <=R; i++) {
                System.out.println(queue[i]+" ");
                
            }
            System.out.println();
            break;
        case 6:
            System.out.println("exiting....");
            System.exit(0);
            break;
        default:
            System.out.println("invalid choice");
            break;

     }
     sc.close();
}


}
}






