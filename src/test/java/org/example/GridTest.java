package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GridTest {
    @Test
    public void client1(){
        Grid grid=new Grid(5,5);
        Cell cellToAdd = new Cell();
        grid.addCell(new Coordinate(1, 1), cellToAdd);
        assertEquals(cellToAdd, grid.fetchCell(new Coordinate(1, 1)));
    }

    @Test
    public void client2(){
        Grid grid=new Grid(5,5);
        Cell cellToAdd = new Cell();
        grid.addCell(new Coordinate(1, 1), cellToAdd);
        assertFalse(grid.isEmpty(new Coordinate(1, 1)));
    }
}
