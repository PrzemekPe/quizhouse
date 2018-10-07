package com.example.quizhouse.answer;

import com.example.quizhouse.questions.Question;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ANSWER")
@Data
public class Answer {
    @Id
    private Long id;
    @Column(columnDefinition = "TINYINT(1)")
    private Boolean correct;
    private  String userAnswer;
    private  Integer scale;
    @ManyToOne
    @JoinColumn(name = "QUESTION_ID")
    private Question question;
}
