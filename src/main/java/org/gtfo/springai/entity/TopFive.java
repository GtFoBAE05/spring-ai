package org.gtfo.springai.entity;

import java.util.List;

public record TopFive(String context, List<String> topFiveAnswer) {
}
