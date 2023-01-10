package Searching;

public class recursiveSearch {
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};
        int low = 0;
        int high = array.length - 1;
        int x = 50;
        System.out.println(search(array, low, high, x));
    }

    // if array is sorted
    static int search(int array[], int low, int high, int x)
    {

        if(low > high){
            return -1;
        }
        int mid = (low + high) / 2;
        if (array[mid] == x)
        {
            return mid;
        }
        else if (array[mid] > x)
        {
            return search(array, low, mid-1, x);
        }
        else 
        {
            return search(array, mid+1, high, x);
        }
    }
}
