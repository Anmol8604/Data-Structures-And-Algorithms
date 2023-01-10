import java.util.Scanner;

public class Count_SET_bits {
    static void count_naive(int N)
    {
        int count = 0;
        for(int i = 0; i < 32; i++)
        {
            if(((N >> i) & 1) != 0)
            {
                count++;
            }

        }
        System.out.println(count);    
    }
    public static void main(String arsg[])
    {
        intialize();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        System.out.println(look_up(N));
        count_naive(N);
        brian_kerninngam_algo(N);

    }

    static void brian_kerninngam_algo(int N)
    {
        int res = 0;
        while(N > 0)
        {
            N = (N & (N-1));
            res++; 
        }
        System.out.println(res);
    }

    static int []table = new int[256];
    static void intialize()
    {
        table[0] = 0;
        for(int i = 1; i < 256; i++)
        {
            table[i] = (i&1) + table[i/2];
        }
    }
    static int look_up(int N)
    {
        int res = table[N & 0xff];
        N = N>>8;
        res = res + table[N & 0xff];
        N = N>>8;
        res = res + table[N & 0xff];
        N = N>>8;
        res = res + table[N & 0xff];
        
        return res;

    }
}
