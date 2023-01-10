package Searching;

public class sumtriplet {
    public static void main(String[] args) {
        int arr[] = {12, 34, 45 ,56, 78};
        int x = 102;
        System.out.println(trisum(arr, x));
        System.out.println(sum(arr, x));
    }

    static boolean trisum(int arr[], int x)
    {
        int left = 0, rigth = arr.length - 1;
        for(int i = 0; i < arr.length -2; i++)
        {
            if(TwoPointer(arr, x-arr[i], left + i, rigth))
            {
                return true;
            }
        }
        return false;
    }

    static boolean TwoPointer(int arr[], int x, int left, int rigth)
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

    static boolean sum(int arr[], int x)
    {
        for(int i = 0; i < arr.length-2; i++)
        {
            int left = i + 1;
            int rigth = arr.length - 1;
            while(left < rigth)
            {
                if(arr[i] + arr[left] + arr[rigth]  == x)
                {
                    System.out.println("triplet is " + arr[i] + " , " + arr[left] + " and " + arr[rigth]);
                    return true;
                }
                else if (arr[i] + arr[left] + arr[rigth] < x)
                {
                    left++;
                }
                else{
                    rigth--;
                }
            }
        }
        return false;
    }
}
