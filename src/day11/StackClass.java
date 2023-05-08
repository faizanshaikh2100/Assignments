package day11;

public class StackClass {
    private int arr[];
    private int top;
    private int capacity;

    StackClass(int size){
        arr = new int[size];
        top =-1;
        capacity = size;
    }
    public boolean isEmpty(){
      return top==-1;
    }
    public boolean isFull(){
        return top == capacity-1;
    }
    public void push(int element){
        if(!isFull())arr[++top]= element;
    }
    public void printStack(){
        for (int i = 0; i <=top ; i++) {
            System.out.println(arr[i]);
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is emnpty");
            System.exit(1);
        }
        return arr[top--];
    }

    public static void main(String[] args) {
        StackClass stackClass = new StackClass(5);
        stackClass.push(5);
        stackClass.push(4);
        stackClass.push(6);
        stackClass.push(7);
        stackClass.push(11);

        stackClass.pop();
        stackClass.printStack();
    }
}
