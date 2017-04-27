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
	@Test
	public void GetASpareWithRollsOfTwoAndEightAndSevenShouldBeTwentyFour() { // Test de un Spare que para entendera tenemos que mirar el main
		game.roll(2);
		game.roll(8);
		game.roll(7);
		rollAndPins(0,17);
		result=game.score();
	    
		assertEquals(24,result);
	}
	@Test
	public void GetAStrikeWhitRollsOfTenAndFourAndThreeShoulBeTwentyFour() { // Test de un Strike
		game.roll(10);
		game.roll(4);
		game.roll(3);
		rollAndPins(0,16);
		result=game.score();
	    
		assertEquals(24,result);
	}
	
	@Test
	public void GetAPerfectGameOf300PointsWithtwelveRollsAndTenPinsPerRoll() { // Score perfecto de 300 puntos con 12 tiros y 10 pinos por tiro
		rollAndPins(10, 12);
		result=game.score();
	    
		assertEquals(300,result);
	}
	private void rollAndPins(int pins,int rolls) {  //Un metodo privado dentro de la clase test para colocar la cantidad
		                                            // de pinos y tiros y que me ayudara a hacer un refactor para las otras pruebas
		for (int i=0;i<rolls;i++) {
			game.roll(pins);
		}
	}
	

}
