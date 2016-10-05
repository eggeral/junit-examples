package gol;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class GolSpec {
    @Test
    public void aDeadCellWithExactlyThreeLivingNeighboursShouldBeAliveInTheNextGeneration() {
        //given
        Cell cell = new Cell(new Position2D(0, 1), false);
        cell.setLivingNeighbours(3);

        //when
        cell.calculateNextGeneration();

        //then
        assertThat(cell.isAlive(), is(true));
    }

    @Test
    public void aLivingCellWithLessThanTwoNeighboursShouldBeDeadInTheNextGeneration() {
        //given
        Cell cell = new Cell(new Position2D(0, 1), true);
        cell.setLivingNeighbours(1);

        //when
        cell.calculateNextGeneration();

        //then
        assertThat(cell.isAlive(), is(false));

    }

    @Test
    public void aLivingCellWithTwoNeighboursShouldBeAliveInTheNextGeneration() {
        //given
        Cell cell = new Cell(new Position2D(0, 1), true);
        cell.setLivingNeighbours(2);

        //when
        cell.calculateNextGeneration();

        //then
        assertThat(cell.isAlive(), is(true));
    }

    @Test
    public void aLivingCellWithThreeNeighboursShouldBeAliveInTheNextGeneration() {
        //given
        Cell cell = new Cell(new Position2D(0, 1), true);
        cell.setLivingNeighbours(3);

        //when
        cell.calculateNextGeneration();

        //then
        assertThat(cell.isAlive(), is(true));
    }

    @Test
    public void aLivingCellWithMoreThanThreeNeighboursShouldBeDeadInTheNextGeneration() {
        //given
        Cell cell = new Cell(new Position2D(0, 1), true);
        cell.setLivingNeighbours(4);

        //when
        cell.calculateNextGeneration();

        //then
        assertThat(cell.isAlive(), is(false));

    }

    @Test
    public void aDeadCellWithLessThanThreeLivingNeighboursShouldBeDead() {
        //given
        Cell cell = new Cell(new Position2D(0, 1), false);
        cell.setLivingNeighbours(2);

        //when
        cell.calculateNextGeneration();

        //then
        assertThat(cell.isAlive(), is(false));
    }

    @Test
    public void aGameCanCalculateTheNextGeneration() {
        //given

        List<Cell> cells = Arrays.asList(
                new Cell(new Position2D(1, 1), true),
                new Cell(new Position2D(1, 2), true),
                new Cell(new Position2D(1, 3), true),
                new Cell(new Position2D(0, 2), false)
        );
        Game game = new Game(cells);

        //when
        game.calculateNextGeneration();

        //then
        assertThat(cells.get(0).isAlive(), is(false));
        assertThat(cells.get(1).isAlive(), is(true));
        assertThat(cells.get(2).isAlive(), is(false));
        assertThat(cells.get(3).isAlive(), is(true));
    }

}
