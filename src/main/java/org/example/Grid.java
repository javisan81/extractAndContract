package org.example;

public class Grid {
    private Cell[][] cells;

    public Grid(int width, int length) {
        cells = new Cell[width][length];
    }

    public void addCell(int x, int y, Cell cell) {
        cells[x][y] = cell;
    }

    public Cell fetchCell(int x, int y) {
        return cells[x][y];
    }

    public boolean isEmpty(int x, int y) {
        return cells[x][y] == null;
    }
}