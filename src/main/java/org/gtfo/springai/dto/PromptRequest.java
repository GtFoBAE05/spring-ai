package org.gtfo.springai.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PromptRequest {
    private String promptMessage;
}
