import java.util.Scanner;

public class SimpleSieveAlgo
{
    static void sievePrintPrimes(int n)
    {
        boolean[] prime = new boolean[n + 1];
        for (int p = 2; p * p <= n; p++)
        {
            // If prime[p] is not changed, then it is a
            // prime
            if (prime[p] == false)
            {
                // Update all multiples of p
                for (int j = p * p; j <= n; j += p)
                {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++)
        {
            if (prime[i] == false)
            {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("number please...!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sievePrintPrimes(n);
    }
}
