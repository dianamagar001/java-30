public class stackoperation{
static final int MAX =100;  ///max size of the stack
static int[] stack = new int[MAX];
static int top =-1;

// CHECK if the stack is empty
static boolean isEmpty(){
    return  top < 0;

}
// check is the stack is full
static boolean isFull(){
    return top >=MAX-1;
}
//    check the size of stack
static  int stackSize (){
  return top + 1;
}

}

// push operation
static void push (int element){
  if(isFull()){
    System.out.println("stack overflow!! cannot push the element");
    return;
  }
  stack[++top]=element;
  System.out.println("the pushed element in the stack is :"+element);
}

// pop operation
static int pop(){
  if(isEmpty()){
    System.out.println("stack empty");
    return -1;
  }
int element=stack[top--];
  System.out.println("the poped element is"+ element);
  return element;
}

// pjavaeak operation
static int peak(){
  if(isEmpty){
  System.out.println("stack is empty");
  return -1;
  }
return stack[top];

}

// display operation
static void display(){
if(isEmpty){
  System.out.println("stack is empty")
  return ;
}
for(int i=top;i>=0;i--){
  
}

}


public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--------STACK MENU--------");
            System.out.println("1. Is stack empty?");
            System.out.println("2. Is stack full?");
            System.out.println("3. Stack Size");
            System.out.println("4. Stack PUSH");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Is stack empty?: " + isEmpty());
                    break;

                case 2:
                    System.out.println("Is stack full?: " + isFull());
                    break;

                case 3:
                    System.out.println("Stack size: " + stackSize());
                    break;

                case 4:
                    System.out.print("Enter the element: ");
                    int element = sc.nextInt();
                    push(element);
                    break;

                case 5:
                    System.out.println("Thank you. Exiting....");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again");
            }
        }
    }