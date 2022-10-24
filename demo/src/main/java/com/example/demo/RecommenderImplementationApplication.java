package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class RecommenderImplementationApplication {

	public static void main(String[] args) {
		//SpringApplication.run(RecommenderImplementationApplication.class, args);
		RecommenderImplementation recommender = new RecommenderImplementation(new ContentBasedFilter());
		String[] result = recommender.recommendedMovies("Finding Dorry");
		System.out.println(Arrays.toString(result));
	}
}
