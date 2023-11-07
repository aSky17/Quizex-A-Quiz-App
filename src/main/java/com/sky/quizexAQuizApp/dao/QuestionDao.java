package com.sky.quizexAQuizApp.dao;

import com.sky.quizexAQuizApp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {


    List<Question>  findByCategory(String category);
    //Your data JPA is smart enough to know that you want to find by category
    //But, if you want more customisation then you have to use HQL(Hibernate query language)t



    @Query(value = "SELECT * FROM question q WHERE q.category = :category ORDER BY RAND() LIMIT :numQ", nativeQuery = true)
    List<Question> findRandomQuestionByCategory(@Param("category") String category, @Param("numQ") int numQ);

    //now lets see the customization of HQL
}
