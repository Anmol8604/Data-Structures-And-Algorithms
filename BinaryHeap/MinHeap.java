package BinaryHeap;

public class MinHeap {
    int[] arr;
    int size, cap;

    MinHeap(int cap) {
        arr = new int[cap];
        this.cap = cap;
        size = 0;
//        arr = new int[]{50, 40, 60, 55, 45, 70, 65};
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
        if(left(n) >= cap){
            return;
        }
        int smallest = left(n);
        int lt = left(n);
        int rt = right(n);
        if(rt < cap){
            if(arr[lt] != arr[rt]){
                smallest = arr[lt] < arr[rt] ? lt : rt;
            }
        }
        if(arr[smallest] != arr[n] && arr[n] > arr[smallest]) {
            int temp = arr[smallest];
            arr[smallest] = arr[n];
            arr[n] = temp;
            heapify(smallest);
        }
    }
    int extractMin(){
        if(size == 0){
            return Integer.MAX_VALUE;
        }
        if(size == 1){
            size--;
            return arr[0];
        }
        int temp = arr[0];
        arr[0] = arr[--size];
        arr[size] = 0;
        heapify(0);
        return temp;
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

//        minHeap.heapify(0);
        int n = minHeap.extractMin();
        System.out.println(n);
        minHeap.display();

    }

}