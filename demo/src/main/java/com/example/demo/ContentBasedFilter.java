package com.example.demo;

public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
