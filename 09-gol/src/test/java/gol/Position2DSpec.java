package gol;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.number.OrderingComparison.*;
import static org.junit.Assert.*;

import org.junit.Test;


public class Position2DSpec {
	
	@Test
	public void aPosition2DCanCalculateTheDistanceToAnotherPosition2D() {
		assertThat(new Position2D(1,1).distanceFrom(new Position2D(1,1)), is(0.0));
		
		assertThat(new Position2D(1,1).distanceFrom(new Position2D(2,1)), is(1.0));
		assertThat(new Position2D(1,1).distanceFrom(new Position2D(2,2)), is(lessThan(2.0)));

		assertThat(new Position2D(1,1).distanceFrom(new Position2D(3,1)), is(2.0));
		assertThat(new Position2D(1,1).distanceFrom(new Position2D(3,3)), is(greaterThan(2.0)));
		
	}
}
