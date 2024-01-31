package com.simplequiz;

import com.simplequiz.dto.PlayerDTO;
import com.simplequiz.model.Question;
import com.simplequiz.model.User;
import com.simplequiz.service.GameplayService;
import com.simplequiz.service.QuizDataBaseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
class QuizSimplesApplicationTests {

	@Autowired
	private QuizDataBaseService quizDataBaseService;
	@Autowired
	private GameplayService gameplayService;

	@Test
	void dataBaseQuizTests() {
		//showMyQuizDatabase();

		User user = new User("Junior", "Junior Fonseca", 30);
		PlayerDTO playerDTO = gameplayService.startQuizGameplay("Nuno","Cinema",user);

		System.out.println("Meu playerDTO instanciado: " + playerDTO);
		System.out.println("E o nosso player tem a seguinte lista do Quiz: " + playerDTO.getPlayerQuestionsList());

	}

	private void showMyQuizDatabase(){
		ArrayList<Question> allQUestionsList = quizDataBaseService.showAllQuestions();

		System.out.println("Meus dados do quiz: " + allQUestionsList);
		System.out.println("Pause\n\n");

		System.out.println("Mostrando apenas o tema Cinema \n" + quizDataBaseService.findByTheme(allQUestionsList, "cinema"));
	}

}
