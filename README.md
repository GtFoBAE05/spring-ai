# Spring AI

This project demonstrates how to integrate Ollama with Spring Boot.

## Features
- **Chatbot**: Interact with Ollama
- **Top 5 Recommendations**: Request top five recommendations
- **Sentiment Analysis**: Analyze sentiment of a sentence

## Prerequisites
- Java 17+
- Spring Boot 3.x
- Ollama Mistral Model

## Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/GtFoBAE05/spring-ai.git

   ```
2. Configure the server port and Ollama model in your application properties.
3. Run the Spring Boot application:
   ```bash
   ./mvnw spring-boot:run
   ```
   or run throught IDE

## Usage
1. Chatbot:Send a message or ask anything to Ollama.
   Endpoint: POST /api/ollama
   Request Body:
   ```json
   {
     "promptMessage": "Hello!, can you tell me how to create pizza?"
   }
   ```
3. Top Five Recommendation: Request top five recommendations based on a prompt.
   Endpoint: POST /api/ollama/top-five
   Request Body:
   ```json
   {
     "promptMessage": "Movie"
   }
   ```
5. Sentiment Analysis: Analyze the sentiment of a given message.
Endpoint: POST /api/ollama/sentiment-analysis
   Request Body:
   ```json
   {
     "promptMessage": "I love this product!"
   }
   ```
