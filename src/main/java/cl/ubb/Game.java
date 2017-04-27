package cl.ubb;

public class Game {
	
	private int[] rolls=new int[21]; 
	private int currentRoll=0;
	
	
	
	public void roll(int pins){
		rolls[currentRoll++]= pins;
		
	}
	
	
	private int scoreStrike(int indexRoll) {
		return rolls[indexRoll] + rolls[indexRoll+1] + rolls [indexRoll+2];
		
	}
	private boolean isStrike(int indexRoll) {
		return rolls[indexRoll] ==10;
	}
	private int spareScore(int indexRoll) {
		return rolls[indexRoll] + rolls[indexRoll+1] + rolls[indexRoll+2];
	}
	private boolean isSpare(int indexRoll) {
		return rolls[indexRoll] + rolls[indexRoll+1] ==10;
	}
	
		private int scoreStandard(int indexRoll) {
			return rolls[indexRoll] + rolls[indexRoll+1];
		}
	
	
	public int score(){
		int score =0;
		int indexRoll=0;
		for(int indexFrame=0; indexFrame<10; indexFrame++) {
			if(isStrike(indexRoll)) {
				score+= scoreStrike(indexRoll);
				indexRoll++;
			}
			else if(isSpare(indexRoll)) {
				score+=spareScore(indexRoll);
				indexRoll+=2;
			}else {
				score+=scoreStandard(indexRoll);
				indexRoll+=2;
			}
			
			
		}
		return score;
	}
	
	
	
}
