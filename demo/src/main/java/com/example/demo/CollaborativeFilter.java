package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {

    @Override
    public String[] getRecommendations(String movie) {
        return new String[0];
    }
}
