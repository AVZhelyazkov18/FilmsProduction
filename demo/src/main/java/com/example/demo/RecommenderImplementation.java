package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    @Autowired
    private Filter filter;
    public String[] recommendedMovies(String movie) {
        return new String[] {"M1", "M2", "M3"};
    }

    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }
}
