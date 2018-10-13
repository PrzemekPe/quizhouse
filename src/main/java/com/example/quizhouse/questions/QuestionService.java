package com.example.quizhouse.questions;

import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class QuestionService {

    private QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    public Question save(@Valid Question question) {
        return questionRepository.save(question);
    }

    public void deleteById(@Valid Long id) {
        questionRepository.deleteById(id);
    }

    public Question findById(@Valid Long id) {
        return questionRepository.findById(id).orElse(new Question());
    }
}
