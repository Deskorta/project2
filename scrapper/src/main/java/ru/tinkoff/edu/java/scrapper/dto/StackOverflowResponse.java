package ru.tinkoff.edu.java.scrapper.dto;

import java.util.List;

public record StackOverflowResponse(List<ru.tinkoff.edu.java.scrapper.DTO.StackOverflowQuestion> questionList) {}
