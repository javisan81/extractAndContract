package org.example;

public class Grid {
    private Cell[][] cells;

    public Grid(int width, int length) {
        cells = new Cell[width][length];
    }

    public void addCell(Coordinate coordinate, Cell cell) {
        cells[coordinate.getX()][coordinate.getY()] = cell;
    }

    public Cell fetchCell(Coordinate coordinate) {
        return cells[coordinate.getX()][coordinate.getY()];
    }

    public boolean isEmpty(Coordinate coordinate) {
        return cells[coordinate.getX()][coordinate.getY()] == null;
    }
}