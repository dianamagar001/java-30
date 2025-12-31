public class linearqueue {
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
    int deletedItem=queue[F];
    F=F+1;
    System.out.println(deletedItem+" is removed from the queue");
    
}
}