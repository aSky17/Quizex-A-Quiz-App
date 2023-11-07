package com.sky.quizexAQuizApp.dao;

import com.sky.quizexAQuizApp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {

}
