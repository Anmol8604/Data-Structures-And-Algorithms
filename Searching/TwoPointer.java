package Searching;

public class TwoPointer {
    public static void main(String[] args) {
        int arr[] = {12, 34, 45 ,56, 78};
        int x = 79;
        int left = 0;
        int rigth = arr.length - 1;
        System.out.println(sum(arr, x, left, rigth));
    }

    static boolean sum(int arr[], int x, int left, int rigth)
    {
        while(left < rigth)
        {
            if(arr[left] + arr[rigth] == x)
            {
                return true;
            }
            else if(arr[left] + arr[rigth] < x)
            {
                left++;
            }
            else 
            {
                rigth--;
            }
        }
        return false;
    }
}
