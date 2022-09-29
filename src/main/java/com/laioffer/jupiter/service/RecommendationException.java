package com.laioffer.jupiter.service;

public class RecommendationException extends RuntimeException {
    public RecommendationException(String errorMessage) {
        super(errorMessage); //提供custumized 的error message
    }
}
