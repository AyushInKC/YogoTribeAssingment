package com.JavaJunie.YogoTribeAssingment.Service;

import org.springframework.stereotype.Service;

@Service
public class PrimeService {

    /**
     * This method checks whether a given number is prime.
     * @param num the number to check
     * @return true if prime, false otherwise
     */
    public boolean isPrime(int num) {
        // Prime numbers are greater than 1
        if (num <= 1) return false;

        // 2 and 3 are prime numbers
        if (num <= 3) return true;

        // Eliminate multiples of 2 and 3
        if (num % 2 == 0 || num % 3 == 0) return false;

        // Only check up to sqrt(num), skipping even numbers
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }

        return true;
    }
}
