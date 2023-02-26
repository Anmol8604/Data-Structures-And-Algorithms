package Stack;

public class MyStack {
    static int top = -1;
    static int arr[];
    static int cap;
    MyStack(int c) {
        this.cap = c;
        arr = new int[c];
    }
    static void push(int a){
        if(top == cap-1) {
            System.out.println("Stack is Full");
            return;
        }
        arr[++top] = a;
    }

    static int pop(){
        if(top == -1) {
            System.out.println("Stack is Empty");
            return Integer.MAX_VALUE;
        }
        System.out.print("Element popped out from stack is : ");
        int res = arr[top];
        top--;
        return res;
    }

    static int peek(){
        if(top == -1) {
            System.out.print("Stack is Empty");
            return Integer.MAX_VALUE;
        }
        System.out.print("Element at the top of Stack is: ");
        int res = arr[top];
        return res;
    }

    static int size(){
        System.out.print("Size of Stack is : ");
        return top+1;
    }

    static boolean isEmpty() {
        System.out.print("is, Stack Empty : ");
        return top == -1;
    }

    public static void main(String[] args) {
        MyStack s = new MyStack(5);

        System.out.println(isEmpty());

        push(10);
        push(20);
        push(30);

        System.out.println(size());

        show();

        System.out.println(pop());
        System.out.println(peek());
        System.out.println(pop());
        System.out.println(size());

        show();

        System.out.println(isEmpty());

    }

    static void show(){
        System.out.print("Elements in Stack are : ");
        for(int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
