package ArrayList;
public class OPERATIONonARRAY {
    /*
    // Searching an element in array
    static int Searching(int aar[], int x, int n)
    {
        for(int i = 0; i < n; i++)
        {
            if(aar[i] == x)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int aar[] = {10, 20, 41, 13};
        int n = aar.length;
        int x = 4;
        System.out.println(Searching(aar, x, n));
    }

    */



    /*
    // Insert opertion on array
    static int Insert(int arr[], int n, int x, int cap, int pos  )
    {
        if(n == cap)
    		return n;

    	int idx = pos - 1;

    	for(int i = n-1; i >= idx; i--)
    	{
        	arr[i + 1] = arr[i];
    	}

    	arr[idx] = x;

    	return n + 1;
    }
    public static void main(String[] args) {
        int arr[] = new int[5], cap = 5, n = 3;

       arr[0] = 5; arr[1] = 10; arr[2] = 20;

       System.out.println("Before Insertion");

       for(int i=0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       int x = 7, pos = 2;

       n = Insert(arr, n, x, cap, pos);

       System.out.println("After Insertion");

       for(int i=0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }
    }
    */



    // Delete OOperation on ARRAY

    static int deleteELEMENTfromARRAY(int arr[], int n, int x)
    {
        int i;
        for(i = 0; i < n; i++)
        {
            if(arr[i] == x)
            {
                break;
            }
        }
        if(i == n)
        {
            return n;
        }
        for(int j = i; j < n-1; j++)
        {
            arr[j] = arr[j+1]; 
        }
        return n-1;

    }
    public static void main(String[] args) {
        int arr[] = {3, 8, 12, 5, 6};
        System.out.println(arr.length); 
        int x = 6;
        int n = 5;
        System.out.println("Before Deletion");

        for(int i=0; i < n; i++)
        {
       		System.out.print(arr[i]+" ");
        }

        System.out.println();
       
        n = deleteELEMENTfromARRAY(arr, n, x);

        System.out.println("After Deletion");

        for(int i=0; i < n; i++)
        {
       		System.out.print(arr[i]+" ");
        }
    }
}
