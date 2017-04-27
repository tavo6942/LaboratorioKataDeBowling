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
		game.roll(3);
		game.roll(5);
		result=game.score();
		
		assertEquals(8,result);
	}

}
