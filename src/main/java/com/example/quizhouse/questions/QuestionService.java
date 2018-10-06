package com.example.quizhouse.questions;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class QuestionService {

    private QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }
    public List<Question> findAll() {
        return StreamSupport.stream(questionRepository.findAll)
    }
}