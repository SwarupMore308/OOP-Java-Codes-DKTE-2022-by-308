import java.util.Scanner;



interface StackInterface{
    void push(int element);
    void pop();
    void peek();

}

interface QueueInterface{
    void enqueue(int element);
    void dequeue();
    void display();
}

class StackQueue implements StackInterface{
    private static int top =-1;
    private static int[] stack;

    private static int front=-1;
    private static int rear=-1;
    private static int[] queue;
    private static int maxStack=0;
    private static int maxQueue=0;

    void setMaxStack(int max){
        maxStack = max;
    }   
    void setMaxQueue(int max){
        maxQueue = max;
    }
    void setStackSize(){
        stack = new int[maxStack];
    }
    void setQueueSize(){
        queue = new int[maxQueue];
    }
    
    public void push(int element){
        if(top>=maxStack-1){
            System.out.println("Stack is full, Can not push element");
            return;
        }
        top++;
        stack[top] = element;
        System.out.println("Element "+element+" pushed into the stack");
    }

    public void pop(){
        if(top<0){
            System.out.println("Stack is empty, can not pop the element");
            return;
        }
        
        int element = stack[top];
        top--;
        System.out.println("Element "+element+" popped from the stack");
    }

    public void peek(){
        if(top==-1){
            System.out.println("There is no elements in stack");
            return;
        }
        
        System.out.println("Element at top is: "+stack[top]);
        
    }

    public void enqueue(int element){   
        if(rear==maxQueue-1){
            System.out.println("Queue is full, cannot insert the element");
            return;
        }
        
            if(front == -1 && rear == -1){
                front++;
                rear++;
                queue[rear]=element;
                System.out.println("Element "+element+" is inserted in queue");
                return;
            }
            rear++;
            queue[rear]=element;
            System.out.println("Element "+element+" is inserted in queue");
        
    }

    public void dequeue(){
        if(rear == -1 && front ==-1){
            System.out.println("Queue is empty, Cannot delete element.");
            return;
        }
        
            int element;
            if(front==rear){
                element = queue[front];
                front = -1;
                rear = -1;
                System.out.println("Element "+element+" is removed from queue");
                return;
            }
            element = queue[front];
            front++;
            System.out.println("Element "+element+" is removed from queue");
        
    }

    public void display(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is empty, No elements to display");
            return;
        }
       
            for(int i=front;i<=rear;i++){
                System.out.println(" "+queue[i]);
            }
        
    }

}


class StackQueueTest {
    public static void main(String[] args) {
        StackQueue sq = new StackQueue();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while(choice>=0){
            System.out.println("1.Stack\n2.Queue\n3.Exit\n:-");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter size of the stack: ");
                    int max = sc.nextInt();
                    sq.setMaxStack(max);
                    sq.setStackSize();
                    while(choice>=0){
                        System.out.print("1.Push\n2.Pop\n3.Peek\n4.Exit\n:-");
                        choice = sc.nextInt();
                        switch(choice){
                            case 1:
                                System.out.print("Enter element: ");
                                int element = sc.nextInt();
                                sq.push(element);
                                break;
                            case 2: 
                                sq.pop();
                                break;
                            case 3:
                                sq.peek();
                                break;
                            case 4:
                                choice =-1;
                                break;
                            default:
                                System.out.println("Wrong Choice!!!");
                                break;
                        }
                    }
                    choice = 1;
                    break;
                case 2:
                    System.out.print("Enter size of the Queue: ");
                    int max1 = sc.nextInt();
                    sq.setMaxQueue(max1);
                    sq.setQueueSize();
                    while(choice>=0){
                        System.out.print("1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\n:-");
                        choice = sc.nextInt();
                        switch(choice){
                            case 1:
                                System.out.print("Enter element: ");
                                int element = sc.nextInt();
                                sq.enqueue(element);
                                break;
                            case 2: 
                                sq.dequeue();
                                break;
                            case 3:
                                sq.display();
                                break;
                            case 4:
                                choice =-1;
                                break;
                            default:
                                System.out.println("Wrong Choice!!!");
                                break;
                        }
                    }
                    choice = 2;
                    break;
                case 3:
                    choice = -1;
                    break;
                
                default:
                    System.out.println("Incorrect Input, Try again!!!");
                    break;
            }
        }
        sc.close();
    }
}