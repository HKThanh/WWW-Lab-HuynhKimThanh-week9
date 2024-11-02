package com.example.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyService {
    public int add(int a, int b) {
        return a + b;
    }

    public List<Integer> multiplyTo10(int a) {
        List<Integer> multiplies = new ArrayList<>();

        for (int i = 1; i <= 10 ; i++) {
            multiplies.add(a * i);
        }

        return multiplies;
    }
}
