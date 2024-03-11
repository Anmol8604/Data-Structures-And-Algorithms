package BinaryHeap;

public class MinHeap {
    int[] arr;
    int size, cap;

    MinHeap(int cap) {
        arr = new int[cap];
        this.cap = cap;
        size = 0;
    }

    void insert(int n){
        if(size == cap) {
            return;
        }
        else{
            arr[size++] = n;
            int p = size-1;
            while(arr[p] < arr[parent(p)]){
                int temp = arr[p];
                arr[p] = arr[parent(p)];
                arr[parent(p)] = temp;

                p = parent(p);
            }
        }
    }

    int left(int i){
        return 2*i + 1;
    }
    int right(int i){
        return 2*i + 2;
    }
    int parent(int i){
        return (i-1)/2;
    }

    void display(){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }


    void heapify(int n){

    }


}

class Main{
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(8);

        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(30);
        minHeap.insert(40);
        minHeap.insert(50);
        minHeap.insert(60);
        minHeap.insert(70);
        minHeap.insert(12);

        minHeap.display();

    }

}