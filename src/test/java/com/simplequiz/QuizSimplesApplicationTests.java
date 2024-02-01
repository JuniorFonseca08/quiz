package com.simplequiz;

import com.simplequiz.builder.PlayerBuilder;
import com.simplequiz.dto.PlayerDTO;
import com.simplequiz.model.Player;
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
	@Autowired
	private PlayerBuilder playerBuilder;

	@Test
	void dataBaseQuizTests() {
		//showMyQuizDatabase();
		//listUserGameplay();
		//exampleDTO();



	}

	private void exampleDTO(){
		Player playerModel = new Player();
		playerModel.setId(1L);
		playerModel.setScore(900);
		playerModel.setNickName("Nunin");
		playerModel.setUser(null);

		System.out.println("Mostre os dados em memoria do meu modelo:\n " + playerModel);

		System.out.println("Agora eu preciso pegar o meu modelo e enviar para a controller");
		System.out.println("Para isso eu preciso transformar ele em DTO do mesmo tipo");

		PlayerDTO playerDTO = null;

		System.out.println("\n\nInicialmente o meu objeto DTO começou valendo: " + playerDTO);

		System.out.println("Vamos passar os dados do MODELO para o DTO");

		playerDTO = playerBuilder.toDTO(playerModel);

		System.out.println("Depois do mapper: " + playerDTO);
		System.out.println("Fim da aplicação");
	}

	private void showMyQuizDatabase(){
		ArrayList<Question> allQUestionsList = quizDataBaseService.showAllQuestions();

		System.out.println("Meus dados do quiz: " + allQUestionsList);
		System.out.println("Pause\n\n");

		System.out.println("Mostrando apenas o tema Cinema \n" + quizDataBaseService.findByTheme(allQUestionsList, "cinema"));
	}


	private void listUserGameplay(){
		User user = new User("Junior", "Junior Fonseca", 30);
		PlayerDTO playerDTO = gameplayService.startQuizGameplay("Nuno","Cinema",user);

		System.out.println("Meu playerDTO instanciado: " + playerDTO);
		System.out.println("E o nosso player tem a seguinte lista do Quiz: " + playerDTO.getPlayerQuestionsList());

	}
}
