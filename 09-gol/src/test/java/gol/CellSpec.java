package gol;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class CellSpec {
	
	@Test
	public void aCellShouldHaveAPositionAndAnAliveState() {
		//given
		Position2D position = new Position2D(10,10);
		
		//when
		Cell cell = new Cell(position, true);
		
		//then
		assertThat(cell.getPosition(),is(equalTo(new Position2D(10,10))));
		assertThat(cell.isAlive(),is(true));
	}
	
}
