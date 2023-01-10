package ArrayList;

public class REverseAnArray {
    public static void main(String[] args) {
        int [] arr = {12, 34, 45, 56, 78, 90};
        int length = arr.length;



        // int size = arr.length - 1;
        
        
        // int i = 0;
        // while(i<size){
        //     int temp = arr[i];
        //     arr[i] = arr[size];
        //     arr[size] = temp;
        //     i++;
        //     size--;
        // }

        // for(int k = 0; k <= arr.length; k++)
        // {
        //     System.out.println(arr[k]);
        // }
        System.out.print("after reversing array is { ");
        reverseArray(arr, length);
        System.out.print("}");
    }

    static void reverseArray(int arr[], int length)
    {
        int i = 0;
        while(i<length-1){
            int temp = arr[i];
            arr[i] = arr[length-1];
            arr[length-1] = temp;
            i++;
            length--;
        }
        
        for(int j = 0; j < arr.length; j++)
        {
            System.out.print(arr[j] + " ");
        }

    }
}