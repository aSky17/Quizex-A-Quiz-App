package com.sky.quizexAQuizApp.dao;

import com.sky.quizexAQuizApp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {


    List<Question>  findByCategory(String category);
    //Your data JPA is smart enough to know that you want to find by category
    //But, if you want more customisation then you have to use HQL(Hibernate query language)

}
