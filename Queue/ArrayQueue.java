package Queue;

public class ArrayQueue {
    int top = -1;
    int Default_val = 10;
    int[] arr;

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(3);
        queue.enqueue(3);
        queue.display();
        queue.dequeue();
        queue.display();
        queue.enqueue(2);
        queue.display();
        queue.enqueue(1);
        queue.display();
        queue.enqueue(2);
        queue.display();
        queue.enqueue(1);
        queue.display();

    }

    ArrayQueue() {
        arr = new int[Default_val];
    }

    ArrayQueue(int size){
        arr = new int[size];
    }

    public void enqueue(int val) {
        if(isFull()){
            System.out.println("Not Possible as Queue is already Full!!!");
            return;
        }
        arr[++top] = val;
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Not Possible as Queue is already Full!!!");
        }
        else{
            for (int i = 1; i <= top; i++){
                arr[i-1] = arr[i];
            }
            arr[top--] = 0;
        }
    }

    public int getFront(){
        if(isEmpty())
            return Integer.MIN_VALUE;
        return arr[0];
    }

    public int getRear(){
        if(isEmpty())
            return Integer.MIN_VALUE;
        return arr[top];
    }

    public boolean isEmpty(){
        if(top == -1){
            return  true;
        }
        return false;
    }

    public boolean isFull(){
        if(top == arr.length-1){
            return true;
        }
        return false;
    }

    public int size() {
        return top+1;
    }

    public void display(){
        for (int i = 0; i <= top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
