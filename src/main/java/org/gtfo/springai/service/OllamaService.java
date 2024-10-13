package org.gtfo.springai.service;

import org.gtfo.springai.dto.PromptRequest;
import org.gtfo.springai.dto.PromptResponse;

public interface OllamaService {
    PromptResponse callOllama(PromptRequest promptRequest);

    PromptResponse askTopFiveToOllama(PromptRequest promptRequest);

    PromptResponse askSentimentAnalysisToOllama(PromptRequest promptRequest);
}
