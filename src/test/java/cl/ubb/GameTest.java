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
		rollAndPins(3,1);
		rollAndPins(5,1);
		result=game.score();
		
		
		assertEquals(8,result);
	}
	@Test
	public void GetInAllFramesScoreZero() { 
		rollAndPins(0,20);
	    result=game.score();
		
		assertEquals(0,result);
	}
	@Test
	public void GetOneInAllRollsShoulbBeTwenty() { 
		rollAndPins(1,20);
	    result=game.score();
		assertEquals(20,result);
	}
	private void rollAndPins(int pins,int rolls) {  //Un metodo privado dentro de la clase test para colocar la cantidad
		                                            // de pinos y tiros y que me ayudara a hacer un refactor para las otras pruebas
		for (int i=0;i<rolls;i++) {
			game.roll(pins);
		}
	}
	

}
