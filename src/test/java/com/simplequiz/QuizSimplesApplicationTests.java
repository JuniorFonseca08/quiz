package com.simplequiz;

import com.simplequiz.model.Question;
import com.simplequiz.service.QuizDataBaseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class QuizSimplesApplicationTests {

	@Autowired
	private QuizDataBaseService quizDataBaseService;

	@Test
	void dataBaseQuizTests() {
		ArrayList<Question> allQUestionsList = quizDataBaseService.showAllQuestions();

		System.out.println("Meus dados do quiz: " + allQUestionsList);
		System.out.println("Pause\n\n");

		System.out.println("Mostrando apenas o tema Cinema \n" + quizDataBaseService.findByTheme(allQUestionsList, "cinema"));

	}

}
