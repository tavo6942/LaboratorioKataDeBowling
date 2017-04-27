package cl.ubb;

public class Game {
	
	private int[] rolls=new int[21]; 
	private int currentRoll=0;
	
	
	
	public void roll(int pins){
		rolls[currentRoll++]= pins;
		
	}
	
	//Los dos siguientes metodos son para el calculo de un Spare
	private int spareScore(int indexRoll) {
		return rolls[indexRoll] + rolls[indexRoll+1] + rolls[indexRoll+2];
	}
	private boolean isSpare(int indexRoll) {
		return rolls[indexRoll] + rolls[indexRoll+1] ==10;
	}
	
		private int scoreStandard(int indexRoll) {
			return rolls[indexRoll] + rolls[indexRoll+1];
		}
	
	//Se modifico el metodo score para simplificar las pruebas y todo esto sin hechar a perder las demas pruebas listas
	//Se agrego un indice que indica la cantidad de juegos o frames , con una condiciòn en la que si pasa , se trabaja con la prueba Spare...
	//Sin embargo si no pasa se sigue el procedimiento normal del calculo de puntaje.
	public int score(){
		int score =0;
		int indexRoll=0;
		for(int indexFrame=0; indexFrame<10; indexFrame++) {
			if(isSpare(indexRoll)) {
				score+=spareScore(indexRoll);
			}else {
				score+=scoreStandard(indexRoll);
			}
			indexRoll+=2;
			
		}
		return score;
	}
	
	
}
