package org.gtfo.springai.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PromptResponse <T> {
    private T result;
}
