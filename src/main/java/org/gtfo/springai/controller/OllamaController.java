package org.gtfo.springai.controller;

import lombok.RequiredArgsConstructor;
import org.gtfo.springai.dto.PromptRequest;
import org.gtfo.springai.dto.PromptResponse;
import org.gtfo.springai.service.OllamaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ollama")
public class OllamaController {
    private final OllamaService ollamaService;

    @PostMapping
    public ResponseEntity<?> callOllama(
            @RequestBody PromptRequest promptRequest
    ) {
        PromptResponse promptResponse = ollamaService.callOllama(promptRequest);
        return ResponseEntity.ok().body(promptResponse);
    }

    @PostMapping("top-five")
    public ResponseEntity<?> askOllamaTopFive(
            @RequestBody PromptRequest promptRequest
    ) {
        PromptResponse promptResponse = ollamaService.askTopFiveToOllama(promptRequest);
        return ResponseEntity.ok().body(promptResponse);
    }

    @PostMapping("sentiment-analysis")
    public ResponseEntity<?> askOllamaSentimentAnalysis(
            @RequestBody PromptRequest promptRequest
    ) {
        PromptResponse promptResponse = ollamaService.askSentimentAnalysisToOllama(promptRequest);
        return ResponseEntity.ok().body(promptResponse);
    }

}
