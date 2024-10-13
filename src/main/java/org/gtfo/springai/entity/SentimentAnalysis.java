package org.gtfo.springai.entity;

import java.util.List;

public record SentimentAnalysis(SentimentType sentimentType, List<String> keyPhrases) {
    public enum SentimentType{
        Positive,
        Neutral,
        Negative
    }
}
