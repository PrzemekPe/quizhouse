package com.example.quizhouse.questions;


import com.example.quizhouse.answer.Answer;
import com.example.quizhouse.survey.Survey;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "QUESTIONS")
@Data
public class Question {
    @Id
    private Long id;
    private String title;
    @ManyToMany(mappedBy = "questions")
    private Set<Survey> surveys = new HashSet<>();

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Answer>answers = new HashSet<>();

}
