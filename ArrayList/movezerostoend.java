package ArrayList;

public class movezerostoend {
    public static void main(String[] args) {
        int arr[] = {0, 0, 5, 2, 0, 0, 2};
        int n = arr.length;
        int temp[] = new int[n];
        int res = 0;

        for(int i = 0; i < n; i++)
        {
            if(arr[i] != 0)
            {
                temp[res] = arr[i];
                res++;
            }
        }
        while(res < n)
        {
            temp[res] = 0;
            res++; 
        }

        System.out.print("{");
        for(int j = 0; j < res; j++)
        {
            arr[j] = temp[j];
            System.out.print(arr[j] + " ");
        }
        System.out.print("}");
    }
}
