package Sorting;

public class Sorting_Algo {
    public static void main(String[] args) {
        int[] arr = {2, 9, 6, 2, 1, 9};

        arr = bubble(arr);

        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    public static int[] bubble(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
