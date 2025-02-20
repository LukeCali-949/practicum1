package edu.iu.p466.prime_service.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeServiceTest {

    PrimeService primeService = new PrimeService();

    @Test
    void _23IsPrime() {

        int n = 23;
        boolean expected = false;
        boolean acutal = primeService.isPrime(n);
        assertEquals(expected,acutal);
    }
}