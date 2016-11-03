package com.company;

/**
 * Created by sudheerp on 17/09/16.
 */
public class Test {
    public static void main(String[] args) {
        System.out.print(isPrime(59));
    }
    private static boolean isPrime(int n)
    {
        if (n == 2 || n == 3)
            return true;
        if (n == 1 || n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
}
