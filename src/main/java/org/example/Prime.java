package org.example;

public class Prime {

    static boolean isPrime(int n)
    {
        boolean flag = true;
        for (int i = 2; i <= n / 2; ++i) {

            if (n % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    static int nextPrime(int N)
    {
        int prime = N;
        boolean found = false;

        while (!found)
        {
            prime++;

            if (isPrime(prime))
                found = true;
        }
        return prime;
    }
}
