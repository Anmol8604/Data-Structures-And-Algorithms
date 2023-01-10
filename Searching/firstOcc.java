package Searching;


public class firstOcc {
    public static void main(String[] args) {
        int array[] = {10, 20, 20, 20, 30, 40, 50};
        int x = 20;
        int low = 0;
        int high = array.length-1;
        //System.out.println(naive(array, x));
        System.out.println(recursive(array, x, low, high));
    }

    static int naive(int array[], int x)
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == x)
            {
                return i;
            }
        }
        return -1;
    }


    static int recursive(int array[], int x, int low, int high)
    {
        if(low > high)
        {
            return -1;
        }
        int mid = (low + high)/2;
        if(array[mid] > x)
        {
            return recursive(array, x, low, mid-1);
        }
        else if(array[mid] < x)
        {
            return recursive(array, x, mid+1, high);
        }
        else{
            if(mid == 0 || array[mid-1] != array[mid]){
                return mid;
            }
            else{
                return recursive(array, x, low, mid -1);
            }
        }
    }
}
