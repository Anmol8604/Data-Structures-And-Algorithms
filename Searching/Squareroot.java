package Searching;

public class Squareroot{
    public static void main(String[] args)
    {
        int x = 81;
        System.out.println(squarert(x));
    }
    
    static int squarert(int x)
    {
        int low = 1, high = x;
        int ans = 0;
        while(low <= high)
        {
            int mid = (low + high)/2;
            int msq = mid*mid;
            if(msq == x)
            {
                return mid;
            }
            if(msq > x)
            {
                high = mid -1;
            }
            if(msq < x)
            {
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }
}