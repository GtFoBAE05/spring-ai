package org.gtfo.springai.service.impl;

import lombok.RequiredArgsConstructor;
import org.gtfo.springai.dto.PromptRequest;
import org.gtfo.springai.dto.PromptResponse;
import org.gtfo.springai.entity.SentimentAnalysis;
import org.gtfo.springai.service.OllamaService;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.gtfo.springai.constant.PromptInstruction.*;

@Service
@RequiredArgsConstructor
public class OllamaServiceImpl implements OllamaService {
    private final ChatClient chatClient;

    @Override
    public PromptResponse<String> callOllama(PromptRequest promptRequest) {
        String response = chatClient.prompt().system(GENERAL_PROMPT_INSTRUCTION).user(promptRequest.getPromptMessage()).call().chatResponse().getResult().getOutput().getContent();

        return PromptResponse.<String>builder()
                .result(response)
                .build();
    }

    @Override
    public PromptResponse<List<String>> askTopFiveToOllama(PromptRequest promptRequest) {
        List<String> entity = chatClient.prompt().system(TOP_FIVE_PROMPT_INSTRUCTION).user(promptRequest.getPromptMessage()).call().entity(new ParameterizedTypeReference<List<String>>() {
        });

        return PromptResponse.<List<String>>builder()
                .result(entity)
                .build();
    }

    @Override
    public PromptResponse askSentimentAnalysisToOllama(PromptRequest promptRequest) {
        SentimentAnalysis sentimentAnalysis = chatClient.prompt().system(SENTIMENT_ANALYSIS_PROMPT_INSTRUCTION).user(promptRequest.getPromptMessage()).call().entity(new ParameterizedTypeReference<SentimentAnalysis>() {
        });

        return PromptResponse.<SentimentAnalysis>builder()
                .result(sentimentAnalysis)
                .build();
    }
}
