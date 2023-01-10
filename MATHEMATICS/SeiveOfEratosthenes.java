import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.swing.text.html.BlockView;
public class SeiveOfEratosthenes 
{
    static void Naive2(int n)
    {
        System.out.println();
        for(int i = 2; i <= n; i++)
        {
            if (i==2 || i == 3 || i ==5){
                System.out.print(i + " ");
            }
            if(i%2==0 || i%3==0 || i%5==0){
            }
            else {
                System.out.print(i + " ");
            }
        }
    }

    // Seive of ertosthenes
    static void Sieve(int n){
        System.out.println();
        if( n <= 1){
            return;
        }
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i = 2; i*i<= n; i++){
            if(isPrime[i]){
                for(int j = 2*i; j<=n; j= j+i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2; i<=n; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }
    }
    // Shorter length Implimentation
    static void SeiveOferatos(int n)
    {
        
    }  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        naiveSolution(n);
        Naive2(n);
        Sieve(n);
    }

    static void naiveSolution(int n)
    {
        for(int i = 2; i <= n; i++)
        {
            if(primeCheck(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean primeCheck(int n )
    {
        for(int i = 2; i*i <= n; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
