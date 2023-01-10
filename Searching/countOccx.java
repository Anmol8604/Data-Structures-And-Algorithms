package Searching;

public class countOccx {
    public static void main(String[] args) {
        int array[] = {10, 20, 20, 20, 30, 40, 50};
        int x = 20;
        int low = 0;
        int high = array.length-1;
        System.out.println(Countocc(array, x, low, high));
    }


    static int Countocc(int array[] , int x, int low, int high)
    {
        int first = firstOcc(array, x, low, high);
        if(first == -1)
        {
            return 0;
        }
        else{
            return lastOcc(array, x, low, high) - first + 1;
        }
    }
    static int firstOcc(int array[], int x, int low, int high)
    {
        if(low > high)
        {
            return -1;
        }
        int mid = (low + high)/2;
        if(array[mid] > x)
        {
            return firstOcc(array, x, low, mid-1);
        }
        else if(array[mid] < x)
        {
            return firstOcc(array, x, mid+1, high);
        }
        else{
            if(mid == 0 || array[mid-1] != array[mid]){
                return mid;
            }
            else{
                return firstOcc(array, x, low, mid -1);
            }
        }
    }

    static int lastOcc(int array[], int x, int low, int high)
    {
        if(low > high)
        {
            return -1;
        }
        int mid = (low + high)/2;
        if(array[mid] > x)
        {
            return lastOcc(array, x, low, mid-1);
        }
        else if(array[mid] < x)
        {
            return lastOcc(array, x, mid+1, high);
        }
        else{
            if(mid == array.length-1 || array[mid+1] != array[mid]){
                return mid;
            }
            else{
                return lastOcc(array, x, mid + 1, high);
            }
        }
    }
}
