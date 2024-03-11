package Stack;

// Implementing Two stacks in an Array
public class Two_Stack {
    int[] arr;
    int cap;
    int top1;
    int top2;

    Two_Stack(int cap){
        arr = new int[cap];
        top1 = -1;
        top2 = cap;
        this.cap = cap;
    }

    void push1(int val) {
        top1++;
        if(top1 == top2){
            top1--;
            System.out.println("Stack Overflow");
        }
        else {
            arr[top1] = val;
        }
    }

    void push2(int val) {
        top2--;
        if(top2 == top1){
            top2++;
            System.out.println("Stack Overflow");
        }
        else {
            arr[top2] = val;
        }
    }

    int pop1(){
        if(top1 == -1){
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        else {
            System.out.println(arr[top1]);
            return arr[top1--];
        }
    }

    int pop2(){
        if(top2 == cap){
            System.out.println("Stack Underflow");
            return Integer.MIN_VALUE;
        }
        else {
            System.out.println(arr[top2]);
            return arr[top2++];
        }
    }

    void display(){
        for(int i = 0; i < cap; i++) {
            System.out.print(arr[i] +" ");
        }
    }

}


class Two_Stack_Main {
    public static void main(String[] args) {
        Two_Stack s = new Two_Stack(3);
        s.push1(1);
        s.pop1();
        s.push1(3);
        s.push1(4);
        s.push2(2);
        s.push2(3);
        s.display();
    }
}