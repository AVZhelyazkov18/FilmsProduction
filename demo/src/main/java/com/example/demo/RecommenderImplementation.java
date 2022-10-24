package com.example.demo;

public class RecommenderImplementation {

    private Filter filter;
    public String[] recommendedMovies(String movie) {
        return new String[] {"M1", "M2", "M3"};
    }

    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }
}
