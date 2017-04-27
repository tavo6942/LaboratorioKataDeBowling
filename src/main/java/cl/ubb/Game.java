package cl.ubb;

public class Game {
	int score;
	public Game(){
		score=0;
	}
	public int score(){
		return score;
	}
	public void roll(int pins){
		score+=pins;
	
	
	}
}
