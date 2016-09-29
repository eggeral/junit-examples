package gol;

import java.util.List;

public class Game {

	private List<Cell> cells;

	public Game(List<Cell> cells) {
		this.cells = cells;
	}

	public void calculateNextGeneration() {
		for (Cell cell : cells) {
			int numberOfLivingNeigbours = 0;
			for (Cell potentialNeigbour : cells) {
				double distance = cell.getPosition().distanceFrom(potentialNeigbour.getPosition());
				if (potentialNeigbour.isAlive() && distance > 0 && distance < 2.0) 
					numberOfLivingNeigbours ++;
			}
			cell.setLivingNeighbours(numberOfLivingNeigbours);
		}
		
		for (Cell cell : cells) {
			cell.calculateNextGeneration();
		}
	}

}
