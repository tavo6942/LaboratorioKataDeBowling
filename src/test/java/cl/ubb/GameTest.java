package cl.ubb;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

	Game game;
	int result;

	@Before
	public void setUp(){
		game = new Game();
	}

	@Test
	public void rollthreeAndRollFiveShoulbeEight() { // En un solo frame obtener 2 rolls de puntuación cero
		for(int i=0;i<1;i++) {
		game.roll(3);
		game.roll(5);
		result=game.score();
		}
		
		assertEquals(8,result);
	}
	@Test
	public void GetInAllFramesScoreZero() { //Tener puntacion cero en todos los rolls
		for (int i =0; i<20;i++) { // Un for que sirve para contar el juego completo
			game.roll(0);
			result=game.score();
		}
		assertEquals(0,result);
	}
	@Test
	public void GetOneInAllRollsShoulbBeTwenty() { 
		for (int i =0; i<20;i++) { // Un for que sirve para contar todos los frames
			game.roll(1);
			result=game.score();
		}
		assertEquals(20,result);
	}
	

}
